package com.tireservice.booking;

public interface BookingProcessor {

    // Defines what must be done
    Booking processBooking(BookingRequest request);
}
