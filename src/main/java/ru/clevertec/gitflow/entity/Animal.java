package ru.clevertec.gitflow.entity;

public class Animal {
    private Long id;
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
