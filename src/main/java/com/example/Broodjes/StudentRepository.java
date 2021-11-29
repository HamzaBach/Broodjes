package com.example.Broodjes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student, Long> {


   @Query("SELECT voornaam, achternaam, klas from Student" )
   Optional<Student> findStudentsFirstNameLastNameKlas();

   







}
