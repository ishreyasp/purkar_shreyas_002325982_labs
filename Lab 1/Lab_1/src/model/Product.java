/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Product model class
 * 
 * @author Shreyas Purkar
 */
public class Product {
    
    String name;
    String description;
    String availability;
    String price;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String name, String description, String availability, String price) {
        this.name = name;
        this.description = description;
        this.availability = availability;
        this.price = price;
    }

    //Getters and Setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
 
}
