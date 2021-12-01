package com.example.Broodjes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BroodjeConfig {
@Bean("BroodjeConfig")
CommandLineRunner commandLineRunner (BroodjeRepository broodjeRepository){
return args ->
{
    Broodje broodje1 = new Broodje("Martino",3.50);
    broodjeRepository.save(broodje1);
    Broodje broodje2 = new Broodje("Smos",2.50);
    broodjeRepository.save(broodje2);
    Broodje broodje3 = new Broodje("Gezond",3.99);
    broodjeRepository.save(broodje3);

};
}
}
