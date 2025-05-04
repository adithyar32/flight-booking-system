package Controller;
import Model.Flight;
import java.util.ArrayList;

public class FlightController {
    private ArrayList<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void showAvailableFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights are available at the moment.");
            return;
        }

        System.out.println("Available Flights:");
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            System.out.printf(
                    "%d. Flight Number: %s | Origin: %s | Destination: %s | Departure: %s | Seats Available: %d\n",
                    i + 1,
                    flight.getFlightNumber(),
                    flight.getOrigin(),
                    flight.getDestination(),
                    flight.getDepartureTime(),
                    flight.getAvailableSeats()
            );
        }
    }

    public ArrayList<Flight> searchFlights(String origin, String destination) {
        ArrayList<Flight> matchingFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                matchingFlights.add(flight);
            }
        }
        return matchingFlights;
    }

    public Flight getFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }
}

