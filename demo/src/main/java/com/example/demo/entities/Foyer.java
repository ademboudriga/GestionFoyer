package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private String capaciteFoyer;
    @OneToOne(mappedBy="foyer")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    @com.fasterxml.jackson.annotation.JsonIgnore
    @ToString.Exclude
    private Set<Bloc> bloques;
}
