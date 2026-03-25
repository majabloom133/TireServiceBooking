package com.tireservice.booking;

// subclass for summer tire change service
// Inherits from Service (parent)
public class SummerTireChange extends Service {

    // Private field for encapsulation - specific to this service
    private int durationMinutes;

    // Constructor for SummerTireChange
    public SummerTireChange(String id, String name, double basePrice, int durationMinutes) {
        // 'super' connects child with parent
        super(id, name, basePrice);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int calculatePrice() {
        // Apply 10% discount
        double discountRate = 0.10;
        double finalPrice = getBasePrice() * (1.0 - discountRate);

        // Cast to int to match abstract method's return type
        return (int) finalPrice;
    }
}