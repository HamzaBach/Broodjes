package com.example.Broodjes;

import javax.persistence.*;

@Entity
@Table
public class Student {

    //autoincrement voor ID
    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String voornaam;
    private String achternaam;
    private String klas;
    private String email;

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    public String getVoornaam() {
        return voornaam;
    }
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    public String getAchternaam() {
        return achternaam;
    }
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
    public String getKlas() {
        return klas;
    }
    public void setKlas(String klas) {
        this.klas = klas;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Student(Long studentId,String voornaam, String achternaam, String klas, String email){
        this.studentId = studentId;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.klas = klas;
        this.email = email;
}
    public Student(String voornaam, String achternaam, String klas, String email){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.klas = klas;
        this.email = email;
    }

    public Student() {
    }
}
