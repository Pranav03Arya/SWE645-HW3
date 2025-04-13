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
    private List<String> recommendationLikelihood;

    // Getters and Setters

    public survey() {

    }
    public survey(String firstName, String lastName, String streetAddress, String city, String state, String zip, String telephoneNumber, String email, String dateofSurvey, List<String> likedMost, List<String> interestSource, List<String> recommendationLikelihood  ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.dateofSurvey = dateofSurvey;
        this.likedMost = likedMost;
        this.interestSource = interestSource;
        this.recommendationLikelihood = recommendationLikelihood;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }  

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void setCity(String city) {
        this.city = city;
    }   
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }               
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }   
    public void setDateofSurvey(String dateofSurvey) {
        this.dateofSurvey = dateofSurvey;
    }
    public void setLikedMost(List<String> likedMost) {
        this.likedMost = likedMost;
    }   
    public void setInterestSource(List<String> interestSource) {
        this.interestSource = interestSource;
    }
    public void setrecommendationLikelihood(List<String> recommendationLikelihood) {
        this.recommendationLikelihood = recommendationLikelihood;
    }       

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public String getCity() {
        return city;
    }   
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }   
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getEmail() {
        return email;
    }   
    public String getDateofSurvey() {
        return dateofSurvey;
    }
    public List<String> getLikedMost() {
        return likedMost;
    }   
    public List<String> getInterestSource() {
        return interestSource;
    }   
    public List<String> getrecommendationLikelihood() {
        return recommendationLikelihood;
    }          


}
