package org.codejar.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Film {

    @Id
    @Basic
    @Column(name = "film_id")
    private String filmId;

    @Basic
    private String title;

    @Basic
    private String description;

    @Basic
    @Column(name = "tahun_release")
    private Short tahunRelease;

    @Basic
    @Column(name = "main_actor")
    private String mainActor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "actor_on_film",
            joinColumns = {@JoinColumn(name = "actor_id")},
            inverseJoinColumns = {@JoinColumn(name = "film_id")}
    )
    private List<Actor> actors;


    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Short getTahunRelease() {
        return tahunRelease;
    }

    public void setTahunRelease(Short tahunRelease) {
        this.tahunRelease = tahunRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
