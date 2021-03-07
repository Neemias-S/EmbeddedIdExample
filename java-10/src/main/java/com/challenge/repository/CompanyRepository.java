package com.challenge.repository;

import com.challenge.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.image.ConvolveOp;
import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findAllByCandidatesCandidateIdAccelerationId(Long accelerationId);
}
