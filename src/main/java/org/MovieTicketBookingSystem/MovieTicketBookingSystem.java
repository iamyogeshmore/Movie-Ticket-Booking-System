package org.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class MovieTicketBookingSystem {
    private List<Movie> movies;
    List<Seat> seats;
    private List<Booking> bookings;
    private int nextBookingId;

    public MovieTicketBookingSystem() {
        movies = new ArrayList<>();
        seats = new ArrayList<>();
        bookings = new ArrayList<>();
        nextBookingId = 1;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void displayMovies() {
        System.out.println("Available Movies:");
        for (Movie movie : movies) {
            System.out.println("Movie ID: " + movie.getId());
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Genre: " + movie.getGenre());
            System.out.println("Duration: " + movie.getDuration() + " minutes");
            System.out.println("Show Timings: " + movie.getShowTimings());
            System.out.println("-----------------------------");
        }
    }

    public boolean checkSeatAvailability(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                return seat.isAvailable();
            }
        }
        return false;
    }

    public double calculateTicketPrice(int seatNumber, Movie movie) {
        double price = 0;
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                price = seat.getPrice();
                break;
            }
        }
        if (movie.getGenre().equalsIgnoreCase("action")) {
            price += 2;
        }
        return price;
    }

    public void bookTickets(int movieId, String showTiming, List<Integer> seatNumbers) {
        Movie selectedMovie = null;
        for (Movie movie : movies) {
            if (movie.getId() == movieId) {
                selectedMovie = movie;
                break;
            }
        }
        if (selectedMovie == null) {
            System.out.println("Invalid Movie ID");
            return;
        }

        boolean isValidShowTiming = false;
        for (String timing : selectedMovie.getShowTimings()) {
            if (timing.equalsIgnoreCase(showTiming)) {
                isValidShowTiming = true;
                break;
            }
        }

        if (!isValidShowTiming) {
            System.out.println("Invalid Show Timing");
            return;
        }
        List<Seat> selectedSeats = new ArrayList<>();
        double totalPrice = 0;
        for (int seatNumber : seatNumbers) {
            if (!checkSeatAvailability(seatNumber)) {
                System.out.println("Seat " + seatNumber + " is not available.");
                return;
            }
            double ticketPrice = calculateTicketPrice(seatNumber, selectedMovie);
            totalPrice += ticketPrice;
            selectedSeats.add(new Seat(seatNumber, false, ticketPrice));
        }
        int bookingId = nextBookingId++;
        Booking booking = new Booking(bookingId, selectedMovie, selectedSeats, totalPrice);
        bookings.add(booking);

        for (Seat seat : selectedSeats) {
            seat.setAvailable(false);
        }

        System.out.println("Booking Confirmation:");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Movie: " + selectedMovie.getTitle());
        System.out.println("Show Timing: " + showTiming);
        System.out.println("Seats: " + seatNumbers);
        System.out.println("Total Price: $" + totalPrice);
    }
}