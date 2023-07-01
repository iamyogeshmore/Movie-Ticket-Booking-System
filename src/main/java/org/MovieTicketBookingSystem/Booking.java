package org.MovieTicketBookingSystem;

import java.util.List;

public class Booking {
    private int bookingId;
    private Movie movie;
    private List<Seat> selectedSeats;
    private double totalPrice;
    private boolean isConfirmed;

    public Booking(int bookingId, Movie movie, List<Seat> selectedSeats, double totalPrice, boolean isConfirmed) {
        this.bookingId = bookingId;
        this.movie = movie;
        this.selectedSeats = selectedSeats;
        this.totalPrice = totalPrice;
        this.isConfirmed = isConfirmed;
    }

    public Booking(int bookingId, Movie selectedMovie, List<Seat> selectedSeats, double totalPrice) {
        this.bookingId = bookingId;
        this.movie = selectedMovie;
        this.selectedSeats = selectedSeats;
        this.totalPrice = totalPrice;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    public void setSelectedSeats(List<Seat> selectedSeats) {
        this.selectedSeats = selectedSeats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
}
