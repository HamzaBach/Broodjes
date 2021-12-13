package com.example.Broodjes.Bestelling;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BestellingRepository extends JpaRepository<Bestelling, Long> {

    List<Bestelling> findByStudentId(long student_id);
    boolean existsStudentByStudentId(long student_id);


}
