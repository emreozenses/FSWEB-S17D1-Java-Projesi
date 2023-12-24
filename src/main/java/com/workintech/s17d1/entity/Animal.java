package com.workintech.s17d1.entity;

public class Animal {

    private int id;
    private String animalName;


    public Animal() {
    }

    public Animal(int id, String animalName) {
        this.id = id;
        this.animalName = animalName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

}
