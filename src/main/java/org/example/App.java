package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.inference.Inference;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * JavaFX App
 */
public class App extends Application {

    private Inference inference = new Inference();

    static String[] actors = {"Laura_Marano","Ryan_Potter","Olivia_Ritchie","Robin_Williams","Matt_Damon","Taner_Stine","Evan_Hofer","Sandra_Bullock",
            "John_Hamm","Jason_Schwartzman","J_K_Simmons","Paige_O'Hara","Robby_Benson","Jay_Baruchel","Gerard_Butler","Maryl_Streep","Amanda_Seyfried","Christian_Bale",
            "Albert_Brooks","Ellen_DeGeneres","Scott_Weinger","Keanu_Reeves","Melissa_McCarthy","Asa_Butterfield","Chloe_Grace_Moretz","Morgan_Freeman","Kodi_Smith_McPhee",
            "Francois_Cluze","Omar_Sy","Edward_Asner","Jordan_Nagai","Scarlet_Johansson","John_Cena","Shannon_Purser"
    };

    public static void main(String[] args) {

//        ArrayList<String> actorsList = new ArrayList<String>();
//
//        for(int i = 0; i < actors.length; i++) {
//            actorsList.add(i, actors[i]);
//        }

        launch();
    }

    final TextField actorsTextField = new TextField("");
    final TextArea textArea = new TextArea("");

    @SuppressWarnings("unchecked")
    @Override
    public void start(Stage stage) {

        JSONParser jsonParser = new JSONParser();

        final ToggleGroup toggleGroupUserAge = new ToggleGroup();
        final ToggleGroup toggleGroupPreferredActor = new ToggleGroup();
        final ToggleGroup toggleGroupTopRatedFilms = new ToggleGroup();
        final ToggleGroup toggleGroupFilmYear = new ToggleGroup();
        final ToggleGroup toggleGroupFeltDown = new ToggleGroup();
        final ToggleGroup toggleGroupLoverOrSpecialPerson = new ToggleGroup();
        final ToggleGroup toggleGroupLotsToDoAndFewTimeLeft = new ToggleGroup();

        try (FileReader fileReader = new FileReader("src/main/java/org/example/knowledgebase/KnowledgeBase.json")){

            Object object = jsonParser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) object;
//            String initialPremisesList = (String) jsonObject.get("initialPremisesList");

//            JSONArray jsonFileContent = new JSONArray();
//            jsonFileContent.add(object);
//            System.out.println("OBJECT: " + object);
//            jsonFileContent.forEach(jsfc -> parseJsonFileContent((JSONObject) jsfc));
//            jsonFileContent.forEach(JSONObject jsfc : jsonFileContent);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        try {
//            Object obj = jsonParser.parse(new FileReader("src/main/java/org/example/knowledgebase/KnowledgeBase.json"));
//            JSONObject
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        stage.setTitle("Movies expert");
        Group layout = new Group();
        Scene scene = new Scene(layout, 1280, 960);

        GridPane gridPane = new GridPane();

        RadioButton ageAbove17RadioButton = new RadioButton("above 17 years old");
        RadioButton ageUnder17RadioButton = new RadioButton("under 17 years old");
        RadioButton preferredActorRadioButton = new RadioButton("Mark this!");
        RadioButton noPreferredActorRadioButton = new RadioButton("No preferred actor? Mark this!");
        RadioButton topRatedFilmsRadioButton = new RadioButton("yes");
        RadioButton noPreferenceTopRatedFilmsRadioButton = new RadioButton("No preference for film's rating? Mark this!");
        RadioButton recentFilmRadioButton = new RadioButton("recent");
        RadioButton classicFilmRadioButton = new RadioButton("classic");
        RadioButton noPreferenceFilmYearRadioButton = new RadioButton("No preference for film's year? Mark this!");
        RadioButton feltDownManyTimesRadioButton = new RadioButton("Many times");
        RadioButton notSpecifiedFeltDownManyTimesRadioButton = new RadioButton("I will not answer");
        RadioButton havingALoverOrSpecialPersonRadioButton = new RadioButton("YES");
        RadioButton notSpecifiedHavingALoverOrSpecialPersonRadioButton = new RadioButton("I will not answer");
        RadioButton havingLotsToDoAndFewTimeLeftRadioButton = new RadioButton("YES");
        RadioButton notSpecifiedHavingLotsToDoAndFewTimeLeftRadioButton = new RadioButton("I will not answer");

        ageAbove17RadioButton.setToggleGroup(toggleGroupUserAge);
        ageUnder17RadioButton.setToggleGroup(toggleGroupUserAge);

        preferredActorRadioButton.setToggleGroup(toggleGroupPreferredActor);
        noPreferredActorRadioButton.setToggleGroup(toggleGroupPreferredActor);

        topRatedFilmsRadioButton.setToggleGroup(toggleGroupTopRatedFilms);
        noPreferenceTopRatedFilmsRadioButton.setToggleGroup(toggleGroupTopRatedFilms);

        recentFilmRadioButton.setToggleGroup(toggleGroupFilmYear);
        classicFilmRadioButton.setToggleGroup(toggleGroupFilmYear);
        noPreferenceFilmYearRadioButton.setToggleGroup(toggleGroupFilmYear);

        feltDownManyTimesRadioButton.setToggleGroup(toggleGroupFeltDown);
        notSpecifiedFeltDownManyTimesRadioButton.setToggleGroup(toggleGroupFeltDown);

        havingALoverOrSpecialPersonRadioButton.setToggleGroup(toggleGroupLoverOrSpecialPerson);
        notSpecifiedHavingALoverOrSpecialPersonRadioButton.setToggleGroup(toggleGroupLoverOrSpecialPerson);

        havingLotsToDoAndFewTimeLeftRadioButton.setToggleGroup(toggleGroupLotsToDoAndFewTimeLeft);
        notSpecifiedHavingLotsToDoAndFewTimeLeftRadioButton.setToggleGroup(toggleGroupLotsToDoAndFewTimeLeft);

        Button searchMovieButton = new Button();
        searchMovieButton.setText("Start movie search");

        final ComboBox actorsComboBox = new ComboBox();

        for(int i = 0; i < actors.length; i++) {
            actorsComboBox.getItems().add(actors[i]);
        }

        gridPane.setVgap(8);
        gridPane.setHgap(20);
        gridPane.setPadding(new Insets(5,5,5,5));

        gridPane.add(new Label("How old are you?"),0,0);
        gridPane.add(ageUnder17RadioButton, 1,0);
        gridPane.add(ageAbove17RadioButton, 2,0);

        gridPane.add(new Label("Pick your preferred actor"),0,1);   // column = 0, row = 1
        gridPane.add(actorsComboBox,1,1);   // column = 1, row = 1
        gridPane.add(preferredActorRadioButton,2,1);   // column = 2, row = 1
        gridPane.add(noPreferredActorRadioButton,3,1); // column = 4, row = 1

        gridPane.add(new Label("Do you prefer top rated films?"), 0,2);   // column = 0, row = 2
        gridPane.add(topRatedFilmsRadioButton, 1, 2);
        gridPane.add(noPreferenceTopRatedFilmsRadioButton, 2, 2);

        gridPane.add(new Label("What type of film do you prefer?"), 0, 3);
        gridPane.add(recentFilmRadioButton, 1,3);
        gridPane.add(classicFilmRadioButton, 2,3);
        gridPane.add(noPreferenceFilmYearRadioButton, 3,3);

        gridPane.add(new Label("In the past two weeks how often have you felt down?"),0,5);
        gridPane.add(feltDownManyTimesRadioButton, 1 ,5);
        gridPane.add(notSpecifiedFeltDownManyTimesRadioButton, 2 ,5);
        gridPane.add(new Label("Do you have a lover or a special person?"),0,7);
        gridPane.add(havingALoverOrSpecialPersonRadioButton, 1, 7);
        gridPane.add(notSpecifiedHavingALoverOrSpecialPersonRadioButton,2,7);
        gridPane.add(new Label("Do you have lots to do at work,and you are short on time?"),0,9);
        gridPane.add(havingLotsToDoAndFewTimeLeftRadioButton,1,9);
        gridPane.add(notSpecifiedHavingLotsToDoAndFewTimeLeftRadioButton,2,9);

        gridPane.add(searchMovieButton, 1,10);

        /**
         * if the button is pressed then I save user answers, start inference and open a new window/page with the inference's result (movie title)
         * */
        searchMovieButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String filmTitle = "";

                // save answers
                // possible answers
                boolean ageAbove17 = false, ageUnder17 = false;
                boolean preferredActor = false, noPreferredActor = false;
                boolean topRatedFilms = false, noPreferenceTopRatedFilms = false;
                boolean recentFilm = false, classicFilm = false, noPreferenceFilmYear = false;
                String mood = "";

                if(ageAbove17RadioButton.isSelected())
                    ageAbove17 = true;
                else if(ageUnder17RadioButton.isSelected())
                    ageUnder17 = true;

                if(preferredActorRadioButton.isSelected())
                    preferredActor = true;
                else if(noPreferredActorRadioButton.isSelected())
                    noPreferredActor = true;

                if(topRatedFilmsRadioButton.isSelected())
                    topRatedFilms = true;
                else if (noPreferenceTopRatedFilmsRadioButton.isSelected())
                    noPreferenceTopRatedFilms = true;

                if(recentFilmRadioButton.isSelected())
                    recentFilm = true;
                else if(classicFilmRadioButton.isSelected())
                    classicFilm = true;
                else if(noPreferenceFilmYearRadioButton.isSelected())
                    noPreferenceFilmYear = true;

                if(feltDownManyTimesRadioButton.isSelected())
                    mood = "depressive";
                else if(notSpecifiedFeltDownManyTimesRadioButton.isSelected())
                    mood = "happy";

                if(havingALoverOrSpecialPersonRadioButton.isSelected())
                    mood = "love";
                else if(notSpecifiedHavingALoverOrSpecialPersonRadioButton.isSelected())
                    mood = "sad";

                if(havingLotsToDoAndFewTimeLeftRadioButton.isSelected())
                    mood = "stressed";
                else if(notSpecifiedHavingLotsToDoAndFewTimeLeftRadioButton.isSelected())
                    mood = "relaxed";

                inference = new Inference(ageAbove17, ageUnder17,preferredActor,noPreferredActor,topRatedFilms,noPreferenceTopRatedFilms,recentFilm,classicFilm,noPreferenceFilmYear, mood);

                // start inference
                filmTitle = inference.startInference();

                // display inference's result
                gridPane.add(new Label("Your recommended film is:"),0,15);
                gridPane.add(new Label(filmTitle), 1, 15);
            }
        });

        layout.getChildren().add(gridPane);
        stage.setScene(scene);
        stage.show();

    }

    private static void parseJsonFileContent(JSONObject jsonFileContent) {
        // Get initial premises list
        JSONObject initialPremisesList = (JSONObject) jsonFileContent.get("initialPremisesList");
        // Get age premises
        String agePremises = (String) initialPremisesList.get("age");
        System.out.println(agePremises);
        // Get actors list
        ArrayList<String> actorsList = (ArrayList<String>) initialPremisesList.get("actors");
        for(String actor : actorsList) {
            System.out.println(actor);
        }
        // Get topRatedMoviesPreference
        ArrayList<String> ratingIMDB = (ArrayList<String>) initialPremisesList.get("topRatedMoviesPreference");
        for(String rating : ratingIMDB) {
            System.out.println(rating);
        }
        // Get movieYear
        ArrayList<String> movieYear = (ArrayList<String>) initialPremisesList.get("movieYear");
        for(String year : movieYear) {
            System.out.println(year);
        }
    }



}