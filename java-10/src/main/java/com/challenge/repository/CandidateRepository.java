package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends JpaRepository<Candidate, CandidateId> {

    List<Candidate> findByCandidateIdAccelerationId(Long accelerationId);

    List<Candidate> findByCandidateIdCompanyId(Long companyId);

    Optional<Candidate> findByCandidateIdUserIdAndcompanyIdAndAccelerationId(Long userId, Long companyId, Long accelerationId);
}
