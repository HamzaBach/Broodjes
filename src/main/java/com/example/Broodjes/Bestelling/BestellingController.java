package com.example.Broodjes.Bestelling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bestelling")

public class BestellingController {

    private final BestellingService bestellingService;

    @Autowired
    public BestellingController(BestellingService bestellingService) {
        this.bestellingService = bestellingService;
    }

    @GetMapping//voor de persoon achter de kassa
    public List<Bestelling> getBestelling() {
        return bestellingService.getBestelling();
    }

    @GetMapping(path = "{studentId}")
    public List<Bestelling> getBestellingStudent(@PathVariable("studentId") Long studentId) {
        return bestellingService.getBestellingStudent(studentId);
    }

    @GetMapping(path = "{studentId}/schuldsaldo")
    public Double getSchuldSaldo(@PathVariable("studentId") Long studentId) {
        return bestellingService.getSchuldSaldo(studentId);
    }

    @GetMapping(path = "{studentId}/canIOrder")
    public Boolean canIOrder(@PathVariable("studentId") Long studentId) {
        return bestellingService.canIOrder(studentId);
    }

    @PostMapping(path = "{studentId}/{broodjeId}")
    public void addBestelling(@PathVariable("studentId") Long studentId, @PathVariable("broodjeId") Long broodjeId) {
        bestellingService.addBestelling(studentId, broodjeId);
    }


}
