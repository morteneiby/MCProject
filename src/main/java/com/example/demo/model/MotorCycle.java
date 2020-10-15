package com.example.demo.model;
import javax.persistence.*;
import java.util.Set;

@Entity
public class MotorCycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String chassisNumber;
    private String motorNumber;

    @ManyToOne
    BrandModel brandModel;

    @ManyToMany(mappedBy = "motorcycles")
    private Set<Owner> owners;

    public MotorCycle() {

    }

    public MotorCycle(Long id, String brand, String chassisNumber, String motorNumber, BrandModel brandModel, Set<Owner> owners) {
        this.id = id;
        this.brand = brand;
        this.chassisNumber = chassisNumber;
        this.motorNumber = motorNumber;
        this.brandModel = brandModel;
        this.owners = owners;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getMotorNumber() {
        return motorNumber;
    }

    public void setMotorNumber(String motorNumber) {
        this.motorNumber = motorNumber;
    }

    public BrandModel getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(BrandModel brandModel) {
        this.brandModel = brandModel;
    }

    public Set<Owner> getOwners() {
        return owners;
    }

    public void setOwners(Set<Owner> owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", motorNumber='" + motorNumber + '\'' +
                ", brandModel=" + brandModel +
                ", owners=" + owners +
                '}';
    }
}
