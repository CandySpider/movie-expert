package org.example.inference;

import java.util.ArrayList;

public class Inference {

    private ArrayList<Boolean> listaPremiseInitiale;
    private ArrayList<String> listaConcluziiPartiale;
    private ArrayList<String> listaConcluziiFinale;

    private boolean ageAbove17 = false, ageUnder17 = false;
    private boolean preferredActor = false, noPreferredActor = false;
    private boolean topRatedFilms = false, noPreferenceTopRatedFilms = false;
    private boolean recentFilm = false, classicFilm = false, noPreferenceFilmYear = false;

    public Inference(){

    }

    public Inference(boolean ageAbove17,
                     boolean ageUnder17,
                     boolean preferredActor,
                     boolean noPreferredActor,
                     boolean topRatedFilms,
                     boolean noPreferenceTopRatedFilms,
                     boolean recentFilm,
                     boolean classicFilm,
                     boolean noPreferenceFilmYear) {
        this.ageAbove17 = ageAbove17;
        this.ageUnder17 = ageUnder17;
        this.preferredActor = preferredActor;
        this.noPreferredActor = noPreferredActor;
        this.topRatedFilms = topRatedFilms;
        this.noPreferenceTopRatedFilms = noPreferenceTopRatedFilms;
        this.recentFilm = recentFilm;
        this.classicFilm = classicFilm;
        this.noPreferenceFilmYear = noPreferenceFilmYear;
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
