package com.example.Broodjes.Openingsuur;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OpeningsuurRepository extends JpaRepository<Openingsuur, Long> {

    List<Openingsuur> findByDag(int dag);

}
