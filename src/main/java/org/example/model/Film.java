package org.example.model;

public class Film {

    private String title;
    private String genre;
    private String ratingAge;
    private String actor;
    private int ratingIMDB;
    private String mood;
    private String language;
    private String subtitle;
    private int year;

    public Film(String title, String genre, String ratingAge, String actor, int ratingIMDB, String mood, String language, String subtitle, int year) {
        this.title = title;
        this.genre = genre;
        this.ratingAge = ratingAge;
        this.actor = actor;
        this.ratingIMDB = ratingIMDB;
        this.mood = mood;
        this.language = language;
        this.subtitle = subtitle;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
