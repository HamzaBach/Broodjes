package com.example.Broodjes.Broodje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/broodjes")

public class BroodjeController {
    private final BroodjeService broodjeService;

    @Autowired
    public BroodjeController(BroodjeService broodjeService) {
        this.broodjeService = broodjeService;
    }

    @GetMapping
    public List<Broodje> getBroodjes() {
        return broodjeService.getBroodjes();
    }
}
