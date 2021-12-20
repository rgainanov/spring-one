package ru.gb.spring.lesson2.homework;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductInMemoryRepo implements ProductRepo {

    private List<Product> products;

    @Override
    public Product getProductById(long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public boolean addProduct(Product product) {
        return products.add(product);
    }

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
    }
}
