package com.example.Broodjes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class DummyDataConfig {
@Bean
CommandLineRunner commandLineRunner (BroodjeRepository broodjeRepository,BestellingRepository bestellingRepository,
                                     StudentRepository studentRepository){
return args ->
{
    Broodje broodje1 = new Broodje("Martino",3.50);
    broodjeRepository.save(broodje1);
    Broodje broodje2 = new Broodje("Smos",2.50);
    broodjeRepository.save(broodje2);
    Broodje broodje3 = new Broodje("Gezond",3.99);
    broodjeRepository.save(broodje3);

    Bestelling bestelling1 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
    bestellingRepository.save(bestelling1);
    Bestelling bestelling2 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
    bestellingRepository.save(bestelling2);
    Bestelling bestelling3 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
    bestellingRepository.save(bestelling3);

    Student Sebastiaan = new Student("Sebastiaan", "Beerten", "6IB", "a@b.com");
    studentRepository.save(Sebastiaan);

};
}
}
