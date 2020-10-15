package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;

    @ManyToMany
    Set<MotorCycle> motorcycles;

    public Owner() {

    }

    public Owner(Long id, String ownerName, Set<MotorCycle> motorcycles) {
        this.id = id;
        this.ownerName = ownerName;
        this.motorcycles = motorcycles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Set<MotorCycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(Set<MotorCycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", motorcycles=" + motorcycles +
                '}';
    }
}
