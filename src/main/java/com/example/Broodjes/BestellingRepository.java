package com.example.Broodjes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BestellingRepository extends JpaRepository<Bestelling, Long> {

    List<Bestelling> findByStudentId(long student_id);
    boolean existsStudentByStudentId(long student_id);


}
