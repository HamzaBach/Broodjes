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
    private LocalDate bestelling;
    private Double prijs;
    private Boolean betaald;
    private LocalDate leverdatum;

    public Bestelling(Long bestelId, Long broodjeId, Long studentId, LocalDate bestelling, double prijs, boolean betaald, LocalDate leverdatum)
    {
        this.bestelId = bestelId;
        this.broodjeId = broodjeId;
        this.studentId = studentId;
        this.bestelling = bestelling;
        this.prijs = prijs;
        this.betaald = betaald;
        this.leverdatum = leverdatum;

    }

    public Bestelling( Long broodjeId, Long studentId, LocalDate bestelling, double prijs, boolean betaald, LocalDate leverdatum)
    {

        this.broodjeId = broodjeId;
        this.studentId = studentId;
        this.bestelling = bestelling;
        this.prijs = prijs;
        this.betaald = betaald;
        this.leverdatum = leverdatum;

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

    public LocalDate getBestelling() {
        return bestelling;
    }

    public void setBestelling(LocalDate bestelling) {
        this.bestelling = bestelling;
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

    public LocalDate getLeverdatum() {
        return leverdatum;
    }

    public void setLeverdatum(LocalDate leverdatum) {
        this.leverdatum = leverdatum;
    }
}
