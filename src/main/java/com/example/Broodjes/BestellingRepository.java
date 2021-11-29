package com.example.Broodjes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BestellingRepository extends JpaRepository<Bestelling, Long> {


    //@Query("INSERT INTO Bestelling (broodjeId,studentId,bestelling,prijs,betaald,leverdatum")
   // Optional<Bestelling> voegBestellingToe()
    //VALUES (value1, value2, value3, ...))


}
