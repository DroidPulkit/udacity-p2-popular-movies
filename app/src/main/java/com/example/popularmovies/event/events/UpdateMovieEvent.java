package com.example.popularmovies.event.events;

import com.example.popularmovies.entity.Movie;

public class UpdateMovieEvent {

    public final Movie movie;

    public UpdateMovieEvent(Movie movie) {
        this.movie = movie;
    }

}
