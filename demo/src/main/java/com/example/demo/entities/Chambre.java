package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonAlias({ "numeroChambre", "numer_chambre", "numero_chambre" })
    private Long numerChambre;

    @Enumerated(EnumType.STRING)
    @JsonAlias({ "type_chambre", "type" })
    private TypeChambre typeChambre;

    @ManyToOne
    @ToString.Exclude
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
