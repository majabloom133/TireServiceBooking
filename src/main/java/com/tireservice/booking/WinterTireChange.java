package com.tireservice.booking;

// Subclass - extends abstract Service class
// Represent a specific type of tire service
public class WinterTireChange extends Service {

    // Private field for Encapsulation - specific to this service.
    private int durationMinutes;

    // Constructor for WinterTireChange
    // Must match class name
    public WinterTireChange(String id, String name, double basePrice, int durationMinutes) {
        // 'super' must be first line in constructor
        // Sends data to Service class(parent)
        super(id, name, basePrice);

        //Assign local parameter to class field with 'this'
        this.durationMinutes = durationMinutes;
    }

    // Overriding abstract method in parent
    @Override
    public int calculatePrice() {
        // Adding specific storage fee for winter tires
        double storageFee = 500.0;
        // Cast result to (int) to convert double
        return (int) (getBasePrice() + storageFee);
    }
}