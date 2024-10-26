package com.gurukul.Hotel.service.interfac;

import com.gurukul.Hotel.dto.Response;
import com.gurukul.Hotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}