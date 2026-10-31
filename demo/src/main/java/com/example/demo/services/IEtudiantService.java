package com.example.demo.services;

import com.example.demo.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();

    public Etudiant retrieveEtudiant(Long etudiantId);

    public Etudiant addEtudiant(Etudiant e);

    public void removeEtudiant(Long etudiantId);

    public Etudiant modifyEtudiant(Etudiant e);
}
