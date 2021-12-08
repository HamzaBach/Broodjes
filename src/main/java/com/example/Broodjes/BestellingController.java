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

    @GetMapping//voor de persoon achter de kassa
    public List<Bestelling> getBestelling(){return bestellingService.getBestelling();}

    @GetMapping(path = "{studentId}")
    public List<Bestelling> getBestellingStudent(@PathVariable("studentId") Long studentId){
        return bestellingService.getBestellingStudent(studentId);
    }

    @PostMapping(path = "{studentId}/{broodjeId}")
    public void addBestelling(@PathVariable("studentId") Long studentId, @PathVariable("broodjeId")Long broodjeId ){
        bestellingService.addBestelling(studentId, broodjeId);
    }


}
