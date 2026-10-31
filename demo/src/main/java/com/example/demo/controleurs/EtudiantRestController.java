package com.example.demo.controleurs;

import com.example.demo.entities.Etudiant;
import com.example.demo.services.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {

    @Autowired
    private IEtudiantService etudiantService;

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/{etudiantId}")
    public Etudiant getEtudiant(@PathVariable("etudiantId") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("/{etudiantId}")
    public void deleteEtudiant(@PathVariable Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

    @PutMapping("/modify")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        return etudiantService.modifyEtudiant(e);
    }

}
