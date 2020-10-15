package com.example.demo.repository;

import com.example.demo.model.BrandModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandModelRepository extends CrudRepository<BrandModel, Long> {
}
