package org.MovieTicketBookingSystem;

import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int duration;
    private List<String> showTimings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getShowTimings() {
        return showTimings;
    }

    public void setShowTimings(List<String> showTimings) {
        this.showTimings = showTimings;
    }

    public Movie(int id, String title, String genre, int duration, List<String> showTimings) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showTimings = showTimings;
    }
}
