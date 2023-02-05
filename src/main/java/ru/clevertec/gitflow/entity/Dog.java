package ru.clevertec.gitflow.entity;

public class Dog extends Animal {
    private boolean isTrained;

    public Dog() {
    }

    public Dog(String name, boolean isTrained) {
        super(name);
        this.isTrained = isTrained;
    }

    public Dog(Long id, String name, boolean isTrained) {
        super(id, name);
        this.isTrained = isTrained;
    }
}
