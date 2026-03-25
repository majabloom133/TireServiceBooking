package com.tireservice.booking;

public class MemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {
        double discountedPrice = request.getPrice() * 0.9;
        return new Booking("Member " + request.getCustomerName() + " processed with priority. Final price: " + discountedPrice);
    }
}