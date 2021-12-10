package com.example.Broodjes;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OpeningsuurService {

    private final OpeningsuurRepository openingsuurRepository;

    @Autowired
    public OpeningsuurService(OpeningsuurRepository openingsuurRepository){
        this.openingsuurRepository = openingsuurRepository;
    }

    public Boolean websiteAvailability(){
        List<Openingsuur> isItOpen = getOpeningsUren();
        if(isItOpen.equals(null)){
            return false;
        }
        return true;
    }

    public List<Openingsuur> getOpeningsUren(){
        int currentDay = LocalDateTime.now().getDayOfWeek().getValue();//Mon=1, Tue=2, Wed=3, Thu=4, Fri=5, Sat=6, Sun=7
        LocalTime currentTime=LocalDateTime.now().toLocalTime().truncatedTo(ChronoUnit.NANOS); //HH:mm:ss

        List<Openingsuur>openingHoursToday=openingsuurRepository.findByDag(currentDay);//Array met alle openingsuren van vandaag
        List<Openingsuur>openingHoursNow = new ArrayList<>();//array waarin het openingsuren object van de huidige dag en tijd in gestoken wordt.
        for(Openingsuur levertijd:openingHoursToday){
            if(levertijd.getOpeningVan().isBefore(currentTime)&&levertijd.getOpeningTot().isAfter(currentTime)){
                openingHoursNow.add(levertijd);
            }
        }
        if(openingHoursNow.isEmpty()){
            return null;
        }
            return openingHoursNow;
    }
/*
    //Openingsuren voor de huidige dag oproepen
   public Optional<Openingsuur> getOpeningsUrenVandaag(String dag){
        return openingsuurRepository.OpeningsUrenVandaag(dag);
    }
*/
}
