package org.codejar.model;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "actor", schema = "sakila")
public class ActorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short actorId;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;


    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

}
