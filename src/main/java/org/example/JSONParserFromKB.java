package org.example;

import org.example.model.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JSONParserFromKB {
    public static ArrayList<Movie> getMoviesFromJSON() {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        JSONParser jsonParser = new JSONParser();

        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/main/java/org/example/knowledgebase/KB.json"));

            JSONArray jsonArray = (JSONArray) jsonObject.get("movie");

            for (Object object : jsonArray) {
                System.out.println(((JSONObject) object).get("title"));
                System.out.println(((JSONObject) object).get("actor"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return movies;
    }
}
