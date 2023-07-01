package org.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieTicketBookingSystem bookingSystem = new MovieTicketBookingSystem();
        // Create and add movies
        Movie movie1 = new Movie(1, "My Hero Academia: Two Heroes", "Action/Fantasy", 96, List.of("10:00 AM", "2:00 PM", "6:00 PM"));
        Movie movie2 = new Movie(2, "One Piece Film: Red", "Adventure/Action", 125, List.of("11:00 AM", "3:00 PM", "7:00 PM"));
        bookingSystem.addMovie(movie1);
        bookingSystem.addMovie(movie2);

        for (int i = 1; i <= 20; i++) {    // Create and add seats
            double price = (i % 5 == 0) ? 10.5 : 8.5;
            bookingSystem.seats.add(new Seat(i, true, price));
        }
        bookingSystem.displayMovies();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Movie ID: ");
        int movieId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the Show Timing: ");
        String showTiming = scanner.nextLine();

        System.out.print("Enter the number of seats to book: ");
        int numSeats = scanner.nextInt();
        scanner.nextLine();

        List<Integer> seatNumbers = new ArrayList<>();
        for (int i = 0; i < numSeats; i++) {
            System.out.print("Enter Seat " + (i + 1) + " Number: ");
            seatNumbers.add(scanner.nextInt());
            scanner.nextLine();
        }
        bookingSystem.bookTickets(movieId, showTiming, seatNumbers);
    }
}