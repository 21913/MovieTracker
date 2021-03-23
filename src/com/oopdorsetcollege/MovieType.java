package com.oopdorsetcollege;

public abstract class MovieType {

    private String movieType;

    public MovieType (String movieType) {

        this.movieType = movieType;

    }

    public abstract void recomendedFor();

    @Override
    public String toString() {

        return "Type: " + this.movieType;
    }

}
