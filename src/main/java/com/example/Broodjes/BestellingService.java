package com.example.Broodjes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BestellingService {

    private final BestellingRepository bestellingRepository;

    @Autowired
    public BestellingService(BestellingRepository bestellingRepository) {
        this.bestellingRepository = bestellingRepository;
    }

    public List<Bestelling> getBestelling() {
        return this.bestellingRepository.findAll();
    }

    public List<Bestelling> getBestellingStudent(Long studentId) {
        List<Bestelling> bestellingStudent = bestellingRepository.findByStudentId(studentId);
        if (!bestellingRepository.existsStudentByStudentId(studentId)) {
            throw new IllegalStateException("Student with id " + studentId + " does not exist!");
        }
        return bestellingRepository.findByStudentId(studentId);
    }

    public Boolean addBestelling(Bestelling bestelling) {
        //Logica om geen bestelling toe te voegen als er een schuld is (gisteren niet betaald).
        List<Bestelling> bestellingStudent = bestellingRepository.findByStudentId(bestelling.getStudentId());
        int counter = 0;
        for(Bestelling bestelItem:bestellingStudent){
            if(bestelItem.getBetaald().equals(false)&&bestelItem.getLeverdatum().isBefore(LocalDate.now())){
                counter++;
            }
        }
        if(counter==0){
            bestellingRepository.save(bestelling);
            return true;
        } else return false;

    }


}
