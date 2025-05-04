# Flight Booking System

## Description

A Java-based Flight Booking System designed to simulate flight booking functionality. The system allows users to:

- View available flights
- Search flights by route (origin and destination)
- Book seats on flights if available

This project was developed with the aim of exploring core Java concepts and object-oriented programming (OOP) principles. By building this system, I focused on applying object-oriented design, especially using classes, objects, methods, and collections in Java.

## Features

- **View Available Flights**: Displays a list of all flights in the system.
- **Search Flights by Route**: Allows users to search for flights based on their origin and destination.
- **Book a Flight**: Users can book a flight if seats are available.

## Object-Oriented Programming Concepts Used

- **Classes and Objects**: 
  - `Flight` class represents a flight and its properties such as flight number, origin, destination, departure time, and available seats.
  - `FlightController` class manages the flight data and provides methods to add, search, and book flights.
  - Objects of these classes are created to store and manipulate the flight data.

- **Encapsulation**: 
  - Data related to a flight is encapsulated in the `Flight` class. The properties such as `flightNumber`, `origin`, and `availableSeats` are private, and public methods (getters and setters) are used to access or modify them.

- **Methods**: 
  - Various methods in the `FlightController` class are used to add flights (`addFlight()`), display available flights (`showAvailableFlights()`), search flights by route (`searchFlights()`), and book seats (`bookSeat()`).

- **Collections (ArrayList)**: 
  - The `ArrayList` class is used to store and manage the list of flights, allowing dynamic manipulation of flight data.

## Technologies Used

- Java (Core)
- Collections (`ArrayList`)
- Scanner for user input

## Getting Started

### Prerequisites

- Java (JDK 8 or higher)
- Git (for version control)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/adithyar32/flight-booking-system.git
   cd flight-booking-system
