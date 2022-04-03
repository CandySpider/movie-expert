package org.example.model;

public class Movie {

    private String title;
    private String genre;
    private String ratingAge;
    private String actor;
    private int ratingIMDB;
    private String mood;

    private int year;

    public Movie(String title, String genre, String ratingAge, String actor, int ratingIMDB, String mood, int year) {
        this.title = title;
        this.genre = genre;
        this.ratingAge = ratingAge;
        this.actor = actor;
        this.ratingIMDB = ratingIMDB;
        this.mood = mood;
        this.year = year;
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

    public String getRatingAge() {
        return ratingAge;
    }

    public void setRatingAge(String ratingAge) {
        this.ratingAge = ratingAge;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getRatingIMDB() {
        return ratingIMDB;
    }

    public void setRatingIMDB(int ratingIMDB) {
        this.ratingIMDB = ratingIMDB;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
