package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    private Long idReservation;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    @com.fasterxml.jackson.annotation.JsonIgnore
    @ToString.Exclude
    private Set<Etudiant> etudiants;
}
