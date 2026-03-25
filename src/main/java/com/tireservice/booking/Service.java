package com.tireservice.booking;

// Abstract class for all services. Acts like a blueprint.
public abstract class Service {
    // Private fields for Encapsulation (hiding data)
    private String id;
    private String name;
    private double basePrice;

    // Constructor
    // These values are passed down from the subclasses.
    public Service(String id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    // Getters - read access for private fields.
    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return basePrice;
    }

    // Abstract method - must be implemented by subclasses
    // Defines contract for calculating final price
    public abstract double calculatePrice();
}
