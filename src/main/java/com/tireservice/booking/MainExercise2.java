package com.tireservice.booking;

import java.util.ArrayList;
import java.util.List;

// Main class for testing exercise 2
// Use List as parent type
public class MainExercise2 {
    public static void main(String[] args) {

        // Store service objects in a List of parent type
        // 'services' list can hold any subclass of Service
        List<Service> services = new ArrayList<>();

        // Adding subclasses
        // Using 'new' to create objects - but list treats them as Service
        services.add(new WinterTireChange("W-01", "Winter Special", 1000.0, 45));
        services.add(new SummerTireChange("S-01", "Summer Special", 1000.0, 30));

        // Call calculatePrice by Service reference 's'
        // Observe different behaviours (Polymorphism)
        for (Service s : services) {
            // 's' is Service reference
            // Java finds correct Overridden method in subclass
            int finalPrice = s.calculatePrice();

            System.out.println("Service: " + s.getName());
            // Cast back to double if you want .0 in print
            System.out.println("Final Price: " + (double) finalPrice);
            System.out.println("----------------------------");

        }
    }
}
