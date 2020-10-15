package com.example.demo.repository;

import com.example.demo.model.MotorCycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorCycleRepository extends CrudRepository<MotorCycle, Long> {
}



