package com.tireservice.booking;

public class BookingRequest {

    private String customerName;
    private double price;

    public BookingRequest(String customerName,double price) {
        this.customerName = customerName;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }
    public double getPrice() {
        return price;
    }
}
