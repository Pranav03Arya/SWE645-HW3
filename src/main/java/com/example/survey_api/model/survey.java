package com.example.survey_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.List;


@Entity
@Table(name = "surveys")
public class survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String telephoneNumber;
    private String email;
    private String dateofSurvey;
    private List<String> likedMost;
    private List<String> interestSource;
    private List<String> recommendLikelihood;

    // Getters and Setters
}
