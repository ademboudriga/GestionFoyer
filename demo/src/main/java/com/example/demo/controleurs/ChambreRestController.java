package com.example.demo.controleurs;

import com.example.demo.entities.Chambre;
import com.example.demo.services.IChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreRestController {

    @Autowired
    private IChambreService chambreService;

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {

        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/{chambreId}")
    public Chambre getChambre(@PathVariable("chambreId") Long chambreId) {
        return chambreService.retrieveChambre(chambreId);
    }

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c) {

        return chambreService.addChambre(c);
    }

    @DeleteMapping("/{chambreId}")
    public void deleteChambre(@PathVariable Long chambreId) {

        chambreService.removeChambre(chambreId);
    }

    @PutMapping("/modify")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        return chambreService.modifyChambre(c);
    }

}
