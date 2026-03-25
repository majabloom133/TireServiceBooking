package com.tireservice.booking;

public class Booking {
    private String message;

    public Booking(String message) {
        this.message = message;
    }

    public void confirm() {
        System.out.println("Confirmation: " + message);
    }
}
