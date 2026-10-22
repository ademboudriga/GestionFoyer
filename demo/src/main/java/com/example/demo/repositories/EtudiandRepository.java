package com.example.demo.repositories;

import com.example.demo.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiandRepository extends JpaRepository<Etudiant, Long> {

    List<Etudiant> findByDateNaissanceBetween(Date dateNaissanceAfter, Date dateNaissanceBefore);
}


