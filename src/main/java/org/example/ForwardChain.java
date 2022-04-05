/*package org.example;

import org.example.model.ClientChoice;
import org.example.model.Movie;

import java.util.ArrayList;

public class ForwardChain {
    private ArrayList<Movie> movies;
    private ClientChoices clientChoices;

    public ForwardChain(ClientChoices clientChoices, ArrayList<Movie> movies)
    {
        this.clientChoices = clientChoices;
        this.movies = movies;
    }

    public void doInference() {

        for (int i = 0; i < movies.size(); i++) {
            if (!movies.get(i).age().equals(clientChoices.getAge())) {
                movies.remove(i);
                i--;
                continue;
            }
            if (!movies.get(i).getCondition2().equals(clientChoices.getGenre())) {
                movies.remove(i);
                i--;
                continue;
            }
            if (!movies.get(i).getCondition3().equals(clientChoices.getActor())) {
                movies.remove(i);
                i--;
                continue;
            }

            if (movies.get(i).getCondition4() > clientChoices.getRating()) {
                movies.remove(i);
                i--;
                continue;
            }
        }
    }

    public String getResultedRecommendations(){
        String temp = "";
        for(int i = 0; i < movies.size(); i++){
            temp += movies.get(i).getConclusion() + ", ";
        }
        if(temp.equals("")) {
            return "No games found";
        }
        else {
            return temp.substring(0,temp.length()-2);
        }
    }
}
*/