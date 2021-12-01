package com.example.Broodjes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BroodjeService {
    private final BroodjeRepository broodjeRepository;
@Autowired
public BroodjeService(BroodjeRepository broodjeRepository){
    this.broodjeRepository=broodjeRepository;
}
    public List<Broodje> getBroodjes(){
        return this.broodjeRepository.findAll();
    }

}
