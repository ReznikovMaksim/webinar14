package com.company;

public class Animal implements Comparable<Animal>{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.getName());
    }
}
