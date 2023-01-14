package org.evil.domain;


public class Cars {
    private String id;
    private String brand;
    private String carClasses;
    private String name;
    private String color;
    private Double price;

    public Cars() {
        this.id = "0000";
        this.brand = "";
        this.carClasses = "";
        this.name = "";
        this.color = "";
        this.price = 0.0;
    }

    @Override
    public String toString() {
        return brand + " " + carClasses + " " + name
                + " " + color+ " "  + price + "P";
    }

    public Cars(String id, String brand, String carClasses, String name, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.carClasses = carClasses;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClasses() {
        return carClasses;
    }

    public void setCarClasses(String carclasses) {
        this.carClasses =carClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}