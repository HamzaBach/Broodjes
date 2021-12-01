package com.example.Broodjes;

import org.aspectj.apache.bcel.classfile.Module;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table
public class Openingsuur {

    //autoincrement voor ID
    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)
    private Long openingsuurId;
    private LocalTime openingVan;
    private LocalTime openingTot;
    private DayOfWeek dag;
    private int dagenTotLevering;

    public DayOfWeek getDag() {
        return dag;
    }
    public void setDag(DayOfWeek dag) {
        this.dag = dag;
    }
    public Long getOpeningsuurId() {
        return openingsuurId;
    }
    public void setOpeningsuurId(Long openingsuurId) {
        this.openingsuurId = openingsuurId;
    }
    public LocalTime getOpeningVan() {
        return openingVan;
    }
    public void setOpeningVan(LocalTime openingVan) {
        this.openingVan = openingVan;
    }
    public LocalTime getOpeningTot() {
        return openingTot;
    }
    public void setOpeningTot(LocalTime openingTot) {
        this.openingTot = openingTot;
    }
    public int getDagenTotLevering() {
        return dagenTotLevering;
    }
    public void setDagenTotLevering(int dagenTotLevering) {
        this.dagenTotLevering = dagenTotLevering;
    }

    public Openingsuur(Long openingsuurId, LocalTime openingsVan, LocalTime openingTot, DayOfWeek dag, int dagenTotLevering) {
        this.openingsuurId = openingsuurId;
        this.openingVan = openingsVan;
        this.openingTot = openingTot;
        this.dag = dag;
        this.dagenTotLevering = dagenTotLevering;
    }
    public Openingsuur(LocalTime openingsVan, LocalTime openingTot, DayOfWeek dag, int dagenTotLevering) {
        this.openingVan = openingsVan;
        this.openingTot = openingTot;
        this.dag = dag;
        this.dagenTotLevering = dagenTotLevering;
    }

    public Openingsuur(){};
}
