package com.example.demo.controleurs;

import com.example.demo.entities.Universite;
import com.example.demo.services.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteRestController {

    @Autowired
    private IUniversiteService universiteService;

    @GetMapping("/all")
    public List<Universite> getAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/{universiteId}")
    public Universite getUniversite(@PathVariable("universiteId") Long universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @DeleteMapping("/{universiteId}")
    public void deleteUniversite(@PathVariable Long universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    @PutMapping("/modify")
    public Universite modifyUniversite(@RequestBody Universite u) {
        return universiteService.modifyUniversite(u);
    }

}
