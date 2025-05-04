package View;
import Controller.BookingController;
import Controller.FlightController;
import Model.Booking;
import Model.Flight;
import Model.Passenger;
import Payment.PaymentProcessor;

import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightController flightController = new FlightController();
        BookingController bookingController = new BookingController();
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Add sample flights
        flightController.addFlight(new Flight("AI101", "Delhi", "Mumbai", "10:00 AM", 100, 100));
        flightController.addFlight(new Flight("AI102", "Delhi", "Bangalore", "11:00 AM", 100, 100));

        System.out.println("Welcome to Flight Booking System");
        System.out.print("Enter origin: ");
        String origin = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        var flights = flightController.searchFlights(origin, destination);
        if (flights.isEmpty()) {
            System.out.println("No flights found.");
            return;
        }

        System.out.println("Available Flights:");
        for (int i = 0; i < flights.size(); i++) {
            System.out.println((i + 1) + ". " + flights.get(i).getFlightNumber());
        }

        System.out.print("Select flight (number): ");
        int flightChoice = scanner.nextInt();
        Flight selectedFlight = flights.get(flightChoice - 1);

        // Seat booking
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();

        // Passenger details
        scanner.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        Passenger passenger = new Passenger(name, email, phone);
        Booking booking = bookingController.bookSeat(selectedFlight, passenger, seatNumber);

        if (booking != null) {
            System.out.print("Enter payment card number: ");
            String cardNumber = scanner.nextLine();
            if (paymentProcessor.processPayment(cardNumber, 5000)) { // Fixed price
                System.out.println("Booking successful! Booking ID: " + booking.getBookingId());
            }
        }
    }
}

