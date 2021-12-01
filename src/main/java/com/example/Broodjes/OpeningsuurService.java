package com.example.Broodjes;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public List<Openingsuur> getOpeningsUren(){
        return openingsuurRepository.findAll();
    }

    //Openingsuren voor de huidige dag oproepen
   /* public Optional<Openingsuur> getOpeningsUrenVandaag(String dag){
        return openingsuurRepository.OpeningsUrenVandaag(dag);
    }*/

}
