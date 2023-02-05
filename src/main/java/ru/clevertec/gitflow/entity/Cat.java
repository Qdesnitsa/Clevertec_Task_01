package ru.clevertec.gitflow.entity;

public class Cat extends AbstractAnimal {
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

    public boolean isContainsHair() {
        return containsHair;
    }

    public void setContainsHair(boolean containsHair) {
        this.containsHair = containsHair;
    }

    @Override
    public void makeSound() {
        System.out.println("Myau");
    }
}
