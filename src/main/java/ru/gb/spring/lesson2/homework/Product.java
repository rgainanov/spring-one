package ru.gb.spring.lesson2.homework;

public class Product {
    private long id;
    private String title;
    private float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product(long id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Product: [id: %d, title: %s, cost: %f]", id, title, cost);
    }
}
