package com.example.Broodjes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final BestellingRepository bestellingRepository;


@Autowired
public StudentService(StudentRepository studentRepository, BestellingRepository bestellingRepository){
this.studentRepository = studentRepository;
    this.bestellingRepository = bestellingRepository;
}

public List<Student> getStudenten(){

    return studentRepository.findAll();
}

public Double schuld(Long studentId){
    //Logica om geen bestelling toe te voegen als er een schuld is (gisteren niet betaald).
    List<Bestelling> bestellingStudent = bestellingRepository.findByStudentId(studentId);
    Double schuldsaldo = 0.0;
    for(Bestelling bestelItem:bestellingStudent){
        if(bestelItem.getBetaald().equals(false)&&bestelItem.getLeverDatum().isBefore(LocalDate.now())){
            schuldsaldo +=bestelItem.getPrijs();
        }
    }
    return schuldsaldo;
}



}
