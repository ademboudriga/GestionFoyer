package com.example.demo.controleurs;

import com.example.demo.entities.Bloc;
import com.example.demo.services.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocRestController {

    @Autowired
    private IBlocService blocService;

    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/{blocId}")
    public Bloc getBloc(@PathVariable("blocId") Long blocId) {
        return blocService.retrieveBloc(blocId);
    }

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @DeleteMapping("/{blocId}")
    public void deleteBloc(@PathVariable Long blocId) {
        blocService.removeBloc(blocId);
    }

    @PutMapping("/modify")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        return blocService.modifyBloc(b);
    }

}
