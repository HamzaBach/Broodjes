//package com.example.Broodjes;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.Month;
//
//@Configuration
//public class DummyDataConfig {
//@Bean
//CommandLineRunner commandLineRunner (BroodjeRepository broodjeRepository,BestellingRepository bestellingRepository,
//                                     StudentRepository studentRepository, OpeningsuurRepository openingsuurRepository){
//return args ->
//{
//Broodje broodje1 = new Broodje("Martino",3.50);
//    broodjeRepository.save(broodje1);
//    Broodje broodje2 = new Broodje("Smos",2.50);
//    broodjeRepository.save(broodje2);
//    Broodje broodje3 = new Broodje("Gezond",3.99);
//    broodjeRepository.save(broodje3);
//
//    Student Sebastiaan = new Student("Sebastiaan", "Beerten", "6IB", "a@b.com");
//    studentRepository.save(Sebastiaan);
//
//
//    Openingsuur openingsuur1 = new Openingsuur(LocalTime.of(00,00,00),
//            LocalTime.of(9,00,00), 1,0);
//    openingsuurRepository.save(openingsuur1);
//    Openingsuur openingsuur2 = new Openingsuur(LocalTime.of(12,00,00),
//            LocalTime.of(23,59,59), 1,1);
//    openingsuurRepository.save(openingsuur2);
//    Openingsuur openingsuur3 = new Openingsuur(LocalTime.of(00,00,00),
//            LocalTime.of(9,00,00), 2,0);
//    openingsuurRepository.save(openingsuur3);
//    Openingsuur openingsuur4 = new Openingsuur(LocalTime.of(12,00,00),
//            LocalTime.of(23,59,59), 2,1);
//    openingsuurRepository.save(openingsuur4);
//    Openingsuur openingsuur5 = new Openingsuur(LocalTime.of(00,00,00),
//            LocalTime.of(9,00,00), 3,0);
//    openingsuurRepository.save(openingsuur5);
//    Openingsuur openingsuur6 = new Openingsuur(LocalTime.of(12,00,00),
//            LocalTime.of(23,59,59), 3,1);
//    openingsuurRepository.save(openingsuur6);
//    Openingsuur openingsuur7 = new Openingsuur(LocalTime.of(00,00,00),
//            LocalTime.of(9,00,00), 4,0);
//    openingsuurRepository.save(openingsuur7);
//    Openingsuur openingsuur8 = new Openingsuur(LocalTime.of(12,00,00),
//            LocalTime.of(23,59,59), 4,1);
//    openingsuurRepository.save(openingsuur8);
//    Openingsuur openingsuur9 = new Openingsuur(LocalTime.of(00,00,00),
//            LocalTime.of(9,00,00), 5,0);
//    openingsuurRepository.save(openingsuur9);
//    Openingsuur openingsuur10 = new Openingsuur(LocalTime.of(12,00,00),
//            LocalTime.of(23,59,59), 5,3);
//    openingsuurRepository.save(openingsuur10);
//    Openingsuur openingsuur11 = new Openingsuur(LocalTime.of(00,00,00),
//            LocalTime.of(23,59,59), 7,1);
//    openingsuurRepository.save(openingsuur11);
//
//
//
//Bestelling bestelling1 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
//    bestellingRepository.save(bestelling1);
//    Bestelling bestelling2 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
//    bestellingRepository.save(bestelling2);
//    Bestelling bestelling3 = new Bestelling(1L, 1L, LocalDate.of(1982, Month.SEPTEMBER, 9), 1.50, true, LocalDate.of(1982, Month.SEPTEMBER, 9));
//    bestellingRepository.save(bestelling3);
//
//
//
//
//};
//}
//}
