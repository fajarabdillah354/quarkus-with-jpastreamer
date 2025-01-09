package org.codejar.model;


import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.print.attribute.standard.MediaSize;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "film", schema = "sakila")
public class FilmEntity {

    @Basic
    @Column(name = "film_id")
    private short filmId;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "realese_year")
    private Object realeseYear;

    @Basic
    @Column(name = "language_id")
    private short languageId;

    @Basic
    @Column(name = "original_language_id")
    private Short originalLanguageId;

    @Basic
    @Column(name = "rental_duration")
    private short rentalDuration;

    @Basic
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    @Basic
    @Column(name = "length")
    private Short length;

    @Basic
    @Column(name = "replacemet_cost")
    private BigDecimal replacementCost;

    @Basic
    @Column(name = "rating", columnDefinition = "enum('G', 'PG', 'PG-13', 'R', 'NC-17')")
    private Object rating;

    @Basic
    @Column(name = "special_features", columnDefinition = "enum('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    private Object specialFeatures;

    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;




}
