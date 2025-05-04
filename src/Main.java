import java.util.Scanner;
import Controller.FlightController;
import Model.Flight;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        FlightController flightController = new FlightController();

        flightController.addFlight(new Flight("AI101", "Delhi", "Mumbai", "10:00 AM", 100, 100));
        flightController.addFlight(new Flight("AI102", "Delhi", "Bangalore", "11:00 AM", 50, 50));
        flightController.addFlight(new Flight("AI103", "Mumbai", "Chennai", "12:00 PM", 70, 70));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Flight Booking System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Available Flights");
            System.out.println("2. Search Flights by Route");
            System.out.println("3. Book a Flight");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    flightController.showAvailableFlights();
                    break;
                case 2:
                    System.out.print("Enter origin: ");
                    String origin = scanner.next();
                    System.out.print("Enter destination: ");
                    String destination = scanner.next();

                    ArrayList<Flight> flights = flightController.searchFlights(origin, destination);

                    if (flights.isEmpty()) {
                        System.out.println("No flights found for this route.");
                    } else {
                        System.out.println("Matching Flights:");
                        for (Flight flight : flights) {
                            System.out.printf(
                                    "Flight Number: %s | Departure: %s | Seats Available: %d\n",
                                    flight.getFlightNumber(),
                                    flight.getDepartureTime(),
                                    flight.getAvailableSeats()
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter flight number to book: ");
                    String flightNumber = scanner.next();
                    Flight flight = flightController.getFlightByNumber(flightNumber);
                    if (flight != null && flight.getAvailableSeats() > 0) {
                        flight.bookSeat();
                        System.out.println("Booking Successful! Seats remaining: " + flight.getAvailableSeats());
                    } else {
                        System.out.println("Sorry, no available seats on this flight.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Flight Booking System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

