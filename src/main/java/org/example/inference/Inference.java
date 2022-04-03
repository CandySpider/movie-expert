package org.example.inference;

import java.util.ArrayList;

public class Inference {

    private ArrayList<Boolean> initialPremisesList;
    private ArrayList<String> partialPremisesList;
    private ArrayList<String> finalPremisesList;

    private boolean ageAbove17 = false, ageUnder17 = false;
    private boolean preferredActor = false, noPreferredActor = false;
    private boolean topRatedMovies = false, noPreferenceTopRatedMovies = false;
    private boolean recentMovie = false, classicMovie = false, noPreferenceMovieYear = false;
    private String mood = "";

    public Inference(){

    }

    public Inference(boolean ageAbove17,
                     boolean ageUnder17,
                     boolean preferredActor,
                     boolean noPreferredActor,
                     boolean topRatedMovies,
                     boolean noPreferenceTopRatedMovies,
                     boolean recentMovie,
                     boolean classicMovie,
                     boolean noPreferenceMovieYear,
                     String mood) {
        this.ageAbove17 = ageAbove17;
        this.ageUnder17 = ageUnder17;
        this.preferredActor = preferredActor;
        this.noPreferredActor = noPreferredActor;
        this.topRatedMovies = topRatedMovies;
        this.noPreferenceTopRatedMovies = noPreferenceTopRatedMovies;
        this.recentMovie = recentMovie;
        this.classicMovie = classicMovie;
        this.noPreferenceMovieYear = noPreferenceMovieYear;
        this.mood = mood;
    }

    public String startInference(){

//        while(true) { // while extern
//            while(true) { // while intern
//                break;
//            }
//            break;
//        }
        return "THIS WILL BE REMOVED BY FILM'S TITLE";
    }
}
