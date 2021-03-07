package com.challenge.repository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubmissionRepository extends JpaRepository<Submission, SubmissionId> {

    Optional<Submission> findTopByScoreSubmissionIdChallengeId(Long challengeId);

    List<Submission> findAllBySubmissionIdChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);

}
