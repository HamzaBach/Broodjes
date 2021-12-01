package com.example.Broodjes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.DayOfWeek;
import java.util.Optional;

public interface OpeningsuurRepository extends JpaRepository<Openingsuur, Long> {

//Query openingsuren huidige dag oproepen aanmaken

    @Query("SELECT * FROM Openingsuur WHERE dag = ?1")
    Optional<Openingsuur> OpeningsUrenVandaag(String dag);


}
