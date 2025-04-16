package com.example.survey_api.service;

import com.example.survey_api.model.survey;
import com.example.survey_api.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    private RepositoryInterface repository;

    public survey saveSurvey(survey survey) {
        return repository.save(survey);
    }

    public List<survey> getAllSurveys() {
        return repository.findAll();
    }

    public Optional<survey> getSurveyById(Long id) {
        return repository.findById(id);
    }

    public void deleteSurvey(Long id) {
        repository.deleteById(id);
    }

    public Optional<survey> updateSurvey(Long id, survey updatedSurvey) {
        return repository.findById(id)
            .map(existingSurvey -> {
                updatedSurvey.setId(id);
                
                if (updatedSurvey.getLikedMost() == null) {
                    updatedSurvey.setLikedMost(java.util.Collections.emptyList());
                }
                if (updatedSurvey.getInterestSource() == null) {
                    updatedSurvey.setInterestSource(java.util.Collections.emptyList());
                }
                if (updatedSurvey.getrecommendationLikelihood() == null) {
                    updatedSurvey.setrecommendationLikelihood(java.util.Collections.emptyList());
                }
                
                return repository.save(updatedSurvey);
            });
    }
}
