package io.tutorial.spring.garageApp1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    public enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW
    }

    @Id
    private long id;
    private String model;
    private String brand;

    @Column(name = "released_year")
    private int year;
    private Color color;


   public Car(){

   }


    public Car( long id ,String model, String brand, int year, Color color) {
       super();
        this.model = model;
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}