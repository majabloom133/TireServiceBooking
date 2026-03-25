package com.tireservice.booking;

// subclass - represents summer tire change service
// Inherits common data from Service class (parent)
public class SummerTireChange extends Service {

    // Private field - for Encapsulation. Specific to this service.
    private int durationMinutes;

    // Constructor for SummerTireChange.
    // Passes data to Serice class (parent)
    public SummerTireChange(String id, String name, double basePrice, int durationMinutes) {
        // 'super' connects child with parent (Service)
        super(id, name, basePrice);
        // Assign local parameter to class field
        this.durationMinutes = durationMinutes;
    }

    // Overriding abstract method from parent
    @Override
    public double calculatePrice() {
        // Applying 10% discount for summer
        double seasonalDiscount = 0.9;
        return getBasePrice() * seasonalDiscount;
    }
}
