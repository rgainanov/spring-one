package ru.gb.spring.lesson1.homework;

public class Surgeon implements Doctor {
    private String name;

    public Surgeon(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void seePatient(Patient patient) {
        System.out.println("Hello "
                + patient.getName() + ", my name is Dr. "
                + name + ". How may I help you?");
    }
}
