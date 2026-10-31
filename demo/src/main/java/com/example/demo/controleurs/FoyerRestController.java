package com.example.demo.controleurs;

import com.example.demo.entities.Foyer;
import com.example.demo.services.IFoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerRestController {

    @Autowired
    private IFoyerService foyerService;

    @GetMapping("/all")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/{foyerId}")
    public Foyer getFoyer(@PathVariable("foyerId") Long foyerId) {
        return foyerService.retrieveFoyer(foyerId);
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @DeleteMapping("/{foyerId}")
    public void deleteFoyer(@PathVariable Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }

    @PutMapping("/modify")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        return foyerService.modifyFoyer(f);
    }

}
