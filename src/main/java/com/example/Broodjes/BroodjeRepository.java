package com.example.Broodjes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BroodjeRepository extends JpaRepository<Broodje,Long> {

    //Custom query om alle beschikbare broodjes met hun prijzen terug te geven.
     /*@Query("SELECT name, price FROM Broodje")
    Optional<Broodje> findBroodjes ();*/

}
