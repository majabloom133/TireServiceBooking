package com.tireservice.booking;

// subclass - represents summer tire change service
// Inherits common data from Service class (parent)
public class SummerTireChange extends Service implements Discountable {

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

    // Implement method from Discountable interface
    @Override
    public double applyDiscount(double price) {
        // Apply 10% discount
        double discountRate = 0.10;
        return price * (1.0 - discountRate);
    }

    // Use interface method
    @Override
    public double calculatePrice() {
        // Use 'this' to call the implemented method above
        return applyDiscount(getBasePrice());
    }
}
