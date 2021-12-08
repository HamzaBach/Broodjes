package com.example.Broodjes;

import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BestellingService {

    private final BestellingRepository bestellingRepository;
    private final BroodjeRepository broodjeRepository;
    private final OpeningsuurRepository openingsuurRepository;

    @Autowired
    public BestellingService(BestellingRepository bestellingRepository, BroodjeRepository broodjeRepository, OpeningsuurRepository openingsuurRepository) {
        this.bestellingRepository = bestellingRepository;
        this.broodjeRepository = broodjeRepository;
        this.openingsuurRepository = openingsuurRepository;
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

    public Boolean addBestelling(Long studentId, Long broodjeId) {

        int currentDay = LocalDateTime.now().getDayOfWeek().getValue();//Mon=1, Tue=2, Wed=3, Thu=4, Fri=5, Sat=6, Sun=7
        if (openingsuurRepository.findByDag(currentDay).equals(null)) {//bv zaterdag gesloten
            return false;
        } else {

            Bestelling besteldeBroodje = new Bestelling();
            Optional<Broodje> gekozenBroodje = broodjeRepository.findById(broodjeId);

            besteldeBroodje.setBroodjeId(gekozenBroodje.get().getBroodjeId());
            besteldeBroodje.setStudentId(studentId);
            besteldeBroodje.setBestellingsDatum(LocalDate.now());
            besteldeBroodje.setPrijs(gekozenBroodje.get().getPrice());
            besteldeBroodje.setBetaald(false);
            //Logica om leverdatum te bepalen:

            LocalTime currentTime = LocalDateTime.now().toLocalTime().truncatedTo(ChronoUnit.NANOS); //HH:mm:ss
            List<Openingsuur> openingsUurVandaag = openingsuurRepository.findByDag(currentDay);
            for (Openingsuur bestelTijd : openingsUurVandaag) {
                if (bestelTijd.getOpeningVan().isBefore(currentTime) && bestelTijd.getOpeningTot().isAfter(currentTime)) {
                    besteldeBroodje.setLeverDatum(LocalDate.now().plusDays(bestelTijd.getDagenTotLevering()));//leverdatum toegevoegd aan besteldBroodje
                    bestellingRepository.save(besteldeBroodje);
                } else if(!(bestelTijd.getOpeningVan().isBefore(currentTime) && bestelTijd.getOpeningTot().isAfter(currentTime))){
                    return false;//BUG ZIT HIER!!!!!!!!
                }
            }
//            if (besteldeBroodje.getLeverDatum().equals(null)) {
//                return false;
            }
            return true;

        }
    }




//}
