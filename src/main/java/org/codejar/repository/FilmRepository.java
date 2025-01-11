package org.codejar.repository;


import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.codejar.model.Film;
import org.codejar.model.Film$;

import java.util.Optional;

@ApplicationScoped
public class FilmRepository {


    @Inject
    private JPAStreamer jpaStreamer;

    public Optional<Film> getFilmById(String filmId) {
        // Pastikan menggunakan equal dengan tipe data yang sama (String)
        return jpaStreamer.stream(Film.class)
                .filter(film -> film.getFilmId().equals(filmId))
                .findFirst();
    }


}
