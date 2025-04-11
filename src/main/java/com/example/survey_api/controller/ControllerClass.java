package com.example.survey_api.controller;

import com.example.survey_api.model.survey;
import com.example.survey_api.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins = "*") // allow React frontend to access
public class ControllerClass {

    @Autowired
    private SurveyService service;

    @PostMapping
public survey addSurvey(@RequestBody survey newSurvey) {
    return service.saveSurvey(newSurvey);
}


    @GetMapping
    public List<survey> getAllSurveys() {
        return service.getAllSurveys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<survey> getSurveyById(@PathVariable Long id) {
        return service.getSurveyById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        service.deleteSurvey(id);
    }
}
