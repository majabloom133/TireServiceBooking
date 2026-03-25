package com.tireservice.booking;

// Demonstrates abstraction using BookingProcessor interface
public class MainExercise3 {
    public static void main(String[] args) {

        // Create request for a booking. (Name: Maja, Price: 1000.0)
        BookingRequest request = new BookingRequest("Maja", 1000.0);

        // Use interface type as reference
        // You can switch between these 2 implementations

        // Use for Member rules (Discount + Priority):
        BookingProcessor processor = new MemberBookingProcessor();

        // Or this:  For guest rules
        // Bookingprocessor processor = new NonMemberBookingProcessor();

        // Process booking
        Booking result = processor.processBooking(request);

        // Print result
        System.out.println("--- Booking System Output ---");
        result.confirm();
    }
    }