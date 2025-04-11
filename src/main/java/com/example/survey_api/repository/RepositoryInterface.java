package com.example.survey_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.survey_api.model.survey;

public interface RepositoryInterface extends JpaRepository<survey, Long> {
}
