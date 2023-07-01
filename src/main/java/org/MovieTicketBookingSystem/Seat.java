package org.MovieTicketBookingSystem;

public class Seat {
    private int seatNumber;
    private boolean isAvailable;
    private double price;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Seat(int seatNumber, boolean isAvailable, double price) {
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
        this.price = price;
    }
}
