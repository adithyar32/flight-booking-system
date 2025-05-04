package Model;

public class Booking {
    private String bookingId;
    private Flight flight;
    private Passenger passenger;
    private int seatNumber;

    public Booking(String bookingId, Flight flight, Passenger passenger, int seatNumber) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    // Setters
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}

