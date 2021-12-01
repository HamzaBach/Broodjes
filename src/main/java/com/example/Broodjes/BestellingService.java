package com.example.Broodjes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestellingService {

        private final BestellingRepository bestellingRepository;
        @Autowired
        public BestellingService(BestellingRepository bestellingRepository){
            this.bestellingRepository= bestellingRepository;
        }
        public List<Bestelling> getBestelling(){
            return this.bestellingRepository.findAll();
        }

}
