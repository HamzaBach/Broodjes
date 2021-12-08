package com.example.Broodjes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public interface OpeningsuurRepository extends JpaRepository<Openingsuur, Long> {

//Query openingsuren huidige dag oproepen aanmaken
/*
    @Query("SELECT * FROM Openingsuur WHERE dag = ?1")
    Optional<Openingsuur> OpeningsUrenVandaag(String dag);
*/
    List<Openingsuur> findByDag(int dag);
    //List<Openingsuur> findByTime(LocalTime currentTime);

}
