package com.example.Broodjes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean("StudentConfig")
    CommandLineRunner commandLineRunner(StudentRepository repository) {


        return args -> {
            Student Sebastiaan = new Student("Sebastiaan", "Beerten", "6IB", "a@b.com");
            repository.save(Sebastiaan);

        };

    }
}