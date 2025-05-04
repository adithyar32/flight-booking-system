package Controller;
import Model.Booking;
import Model.Flight;
import Model.Passenger;

import java.util.ArrayList;
import java.util.UUID;

public class BookingController {
    private ArrayList<Booking> bookings = new ArrayList<>();

    public Booking bookSeat(Flight flight, Passenger passenger, int seatNumber) {
        if (flight.getAvailableSeats() < 1 || seatNumber > flight.getTotalSeats()) {
            System.out.println("No available seats or invalid seat number.");
            return null;
        }
        flight.setAvailableSeats(flight.getAvailableSeats() - 1);
        Booking booking = new Booking(UUID.randomUUID().toString(), flight, passenger, seatNumber);
        bookings.add(booking);
        return booking;
    }
}
