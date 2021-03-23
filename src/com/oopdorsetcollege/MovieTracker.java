package com.oopdorsetcollege;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;

public class MovieTracker extends MovieType implements MovieInterface {

    private int movieId;
    private String movieName;
    private int yearReleased;

    ArrayList<MovieTracker> movieList = new ArrayList<MovieTracker>();

    private static Formatter print;
    private static String file = "mymovies.txt";

    public MovieTracker(int movieId, String movieName, int yearReleased, String movieType) {

        super(movieType);
        this.movieId = movieId;
        this.movieName = movieName;
        this.yearReleased = yearReleased;

    }

    @Override
    public String toString() {

        return super.toString();

    }

    @Override
    public void recomendedFor() {

        System.out.println("Recomended for: ");

    }

    public void movieCredits() {

        System.out.println("Identifier number: " + this.movieId);
        System.out.println("Movie name: " + this.movieName);
        System.out.println("From: " + this.yearReleased);

    }

    protected void addList(int movieId, String movieName, int yearReleased, String movieType) {
        MovieTracker[] movieList = new MovieTracker[0];
        for (MovieTracker movieTracker : movieList) {
            MovieTracker movieTracker1 = new MovieTracker(movieId, movieName, yearReleased, movieType);
        }

    }

    @Override
    public void OpenFileToWrite(String fileToOpen) {

        try {
            FileWriter fileWriter = new FileWriter(fileToOpen, true);
            print = new Formatter(fileWriter);
        } catch (SecurityException securityException) {
            System.out.println("ACCESS DENIED");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("***ERROR***");
            System.exit(1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    @Override
    public void OpenFileToRead(String file) {

        try {
            print = new Formatter(file);
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }

    }

}



