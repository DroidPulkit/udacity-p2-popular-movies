package com.example.popularmovies.event.events;

import android.support.annotation.NonNull;

import com.example.popularmovies.entity.Movie;

public final class MovieUpdatedEvent {

    public final Movie movie;

    public MovieUpdatedEvent(@NonNull Movie movie) {
        this.movie = movie;
    }

}
