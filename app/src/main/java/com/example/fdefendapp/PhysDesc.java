package com.example.fdefendapp;

public class PhysDesc {
    private int id;
    private String race;
    private String eyeColor;
    private String hairColor;
    private int weight;
    private int height;
    private int iddesc;

    // Default constructor
    public PhysDesc() {
    }

    // Constructor with parameters
    public PhysDesc(int id, String race, String eyeColor, String hairColor, int weight, int height, int iddesc) {
        this.id = id;
        this.race = race;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.weight = weight;
        this.height = height;
        this.iddesc = iddesc;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIddesc() {
        return iddesc;
    }

    public void setIddesc(int iddesc) {
        this.iddesc = iddesc;
    }

    // toString() method
    @Override
    public String toString() {
        return "PhysDesc{" +
                "id=" + id +
                ", race='" + race + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", iddesc=" + iddesc +
                '}';
    }
}
