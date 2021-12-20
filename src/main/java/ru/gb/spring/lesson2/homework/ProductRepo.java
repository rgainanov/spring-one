package ru.gb.spring.lesson2.homework;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepo {
    List<Product> getProducts();

    Product getProductById(long id);

    boolean addProduct(Product product);
}
