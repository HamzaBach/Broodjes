package com.example.Broodjes;





import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Bestelling {

    @Id
    @GeneratedValue

            (strategy = GenerationType.IDENTITY)


    private Long bestelId;
    private Long broodjeId;
    private Long studentId;
    private LocalDate bestellingsDatum;
    private Double prijs;
    private Boolean betaald;
    private LocalDate leverDatum;

    public Bestelling(Long bestelId, Long broodjeId, Long studentId, LocalDate bestellingsDatum, double prijs, boolean betaald, LocalDate leverDatum)
    {
        this.bestelId = bestelId;
        this.broodjeId = broodjeId;
        this.studentId = studentId;
        this.bestellingsDatum = bestellingsDatum;
        this.prijs = prijs;
        this.betaald = betaald;
        this.leverDatum = leverDatum;

    }

    public Bestelling(){};

    public Bestelling(Long broodjeId, Long studentId, LocalDate bestellingsDatum, double prijs, boolean betaald, LocalDate leverDatum)
    {

        this.broodjeId = broodjeId;
        this.studentId = studentId;
        this.bestellingsDatum = bestellingsDatum;
        this.prijs = prijs;
        this.betaald = betaald;
        this.leverDatum = leverDatum;

    }

    public Long getBestelId() {
        return bestelId;
    }

    public void setBestelId(Long bestelId) {
        this.bestelId = bestelId;
    }

    public Long getBroodjeId() {
        return broodjeId;
    }

    public void setBroodjeId(Long broodjeId) {
        this.broodjeId = broodjeId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public LocalDate getBestellingsDatum() {
        return bestellingsDatum;
    }

    public void setBestellingsDatum(LocalDate bestellingsDatum) {
        this.bestellingsDatum = bestellingsDatum;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public Boolean getBetaald() {
        return betaald;
    }

    public void setBetaald(Boolean betaald) {
        this.betaald = betaald;
    }

    public LocalDate getLeverDatum() {
        return leverDatum;
    }

    public void setLeverDatum(LocalDate leverDatum) {
        this.leverDatum = leverDatum;
    }
}
