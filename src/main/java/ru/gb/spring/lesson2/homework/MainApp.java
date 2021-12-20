package ru.gb.spring.lesson2.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepo productRepo = context.getBean("productInMemoryRepo", ProductInMemoryRepo.class);
        System.out.println(productRepo.getProducts());
        productRepo.addProduct(new Product(1L, "Milk", 0.6F));
        productRepo.addProduct(new Product(2L, "Bread", 0.5F));
        productRepo.addProduct(new Product(3L, "Meat", 1.6F));
        System.out.println(productRepo.getProducts());
        System.out.println(productRepo.getProductById(3L));
    }
}
