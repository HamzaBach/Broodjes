package com.example.Broodjes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;


@Configuration
    public class BestellingConfig {
    @Bean("BestellingConfig")
    CommandLineRunner commandLineRunner(BestellingRepository bestellingRepository) {
        return args ->
        {
            Bestelling bestelling1 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
            bestellingRepository.save(bestelling1);
            Bestelling bestelling2 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
            bestellingRepository.save(bestelling1);
            Bestelling bestelling3 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
            bestellingRepository.save(bestelling1);


        };
    }
}



