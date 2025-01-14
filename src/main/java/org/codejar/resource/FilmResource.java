package org.codejar.resource;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.codejar.model.Film;
import org.codejar.repository.FilmRepository;

import java.util.Optional;

@Path("/")
public class FilmResource {


    @Inject
    private FilmRepository filmRepository;

    @GET
    @Path("/helloFilm")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloFilm(String filmId){
        return "hello this is film";
    }


    @GET
    @Path("/filmId/{filmId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getFilmById(@PathParam("filmId") String filmId) {
        Optional<Film> film = filmRepository.getFilmById(filmId);
        return film.map(Film::getTitle)
                .orElse("Film ID not found");
    }


}
