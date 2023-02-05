package ru.clevertec.gitflow.entity;

public class Cat extends Animal {
    private boolean containsHair;

    public Cat() {
    }

    public Cat(String name, boolean containsHair) {
        super(name);
        this.containsHair = containsHair;
    }

    public Cat(Long id, String name, boolean containsHair) {
        super(id, name);
        this.containsHair = containsHair;
    }
}
