package org.codejar.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Basic
    private String actorId;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(mappedBy = "actors")
    private Set<Film> films;



}
