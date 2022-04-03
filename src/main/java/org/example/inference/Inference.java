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
    private ArrayList<Boolean> mood = new ArrayList<>();

    public Inference(){

    }

    public Inference(ArrayList<Boolean> initialPremisesList) {
        this.initialPremisesList = initialPremisesList;
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
                     ArrayList<Boolean> mood) {
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

//        while(true) {
//              /*
//                 while extern MA OPRESC IN MOMENTUL IN CARE LA ULTIMA TRECERE NU S-A VALIDAT NICI O REGULA SAU
//                  NU A APARUT NICI O CONCLUZIE PARTIALA INREGISTRATA IN LISTA DE CONCLUZII PARTIALE ATUNCI MA OPRESC
//              */
//            while(true) {
//                  /*
//                     while intern - PARCURG TOATE REGULILE SI PENTRU FIECARE REGULA MA UIT IN PARTEA STANGA SA VAD DACA TOATE PREMISELE EI SUNT
//		                ADEVARATE SAU NU		DACA DA => CONCLUZIE ADEVARATA => DACA ESTE CAZUL O INREGISTREZ IN LISTA DE CONCLUZII PARTIALE DACA EI
//		                NU EXISTA DEJA, MARCHEZ FAPTUL CA S-A FACUT O SCHIMBARE IN ULTIMA TRECERE SI MA UIT DACA ACEA CONCLUZIE NU ESTE SI IN LISTA DE
//		                CONCLUZII FINALE	DACA DA OPRESC INFERENTA SI AM CONCLUZIA	 DACA NU TREC LA URMATOAREA REGULA SI TOT ASA MAI DEPARTE
//		            */
//                break;
//            }
//            break;
//        }
        return "THIS WILL BE REMOVED BY FILM'S TITLE";
    }
}
