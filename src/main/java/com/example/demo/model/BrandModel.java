package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BrandModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brandModel;

    @OneToMany(mappedBy = "brandModel")
    List<MotorCycle> motorCycles;

    public BrandModel() {

    }

    public BrandModel(Long id, String brandModel, List<MotorCycle> motorCycles) {
        this.id = id;
        this.brandModel = brandModel;
        this.motorCycles = motorCycles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public List<MotorCycle> getMotorCycles() {
        return motorCycles;
    }

    public void setMotorCycles(List<MotorCycle> motorCycles) {
        this.motorCycles = motorCycles;
    }

    @Override
    public String toString() {
        return "BrandModel{" +
                "id=" + id +
                ", brandModel='" + brandModel + '\'' +
                ", motorCycles=" + motorCycles +
                '}';
    }
}
