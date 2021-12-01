package com.example.Broodjes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bestelling")

public class BestellingController {

    private final BestellingService bestellingService;

    @Autowired
    public BestellingController (BestellingService bestellingService){
        this.bestellingService=bestellingService;
    }

    @GetMapping
    public List<Bestelling> getBestelling(){return bestellingService.getBestelling();}

    @PostMapping
    public void registerNewBestelling(@RequestBody Bestelling bestelling){
        bestellingService.addBestelling(bestelling);
    }


}
