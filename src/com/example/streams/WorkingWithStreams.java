package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithStreams {
    List<String> movies = new ArrayList<>();
    public void createMovies(){
        movies.add("Train to Busan");
        movies.add("Moon Lovers");
        movies.add("Snow Drop");
        movies.add("Happiness");
    }
    private void findMoviesByDirector(String director){
        movies.stream()
                .filter(movie -> movie.equals(director)?true:false)
                .forEach(System.out::println);
    }
    public static void main(String[] args){
        WorkingWithStreams workingWithStreams = new WorkingWithStreams();
        workingWithStreams.createMovies();
        workingWithStreams.findMoviesByDirector("Happiness");
    }
}
