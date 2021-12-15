package com.company;

public class Human {
    private String name;
    private int age;
    private Animal pet;

    public Human(String name, int age, Animal pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }
//    public String getNameOfPet(){
//        return pet.getName();
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet.getName();
    }
}
