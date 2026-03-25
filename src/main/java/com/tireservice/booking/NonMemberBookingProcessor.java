package com.tireservice.booking;

public class NonMemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {
        return new Booking("Guest " +request.getCustomerName() + " processed. Final price: " + request.getPrice());
    }
}
