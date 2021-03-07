package com.challenge.service.interfaces;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

public class SubmissionService implements SubmissionServiceInterface {

    @Autowired
    private SubmissionRepository repository;

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        return repository.findTopByScoreSubmissionIdChallengeId(challengeId).map(submission -> BigDecimal.valueOf(submission.getScore())).get();
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return repository.findAllBySubmissionIdChallengeIdAndAccelerationId(challengeId,accelerationId);
    }

    @Override
    public Submission save(Submission object) {
        return repository.save(object);
    }
}
