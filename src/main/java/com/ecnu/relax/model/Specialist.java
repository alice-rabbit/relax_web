package com.ecnu.relax.model;

public class Specialist {
    private Integer specialistId;

    private Double rating;

    private String qualification;

    private Integer employLength;

    private String introduction;

    public Integer getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(Integer specialistId) {
        this.specialistId = specialistId;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }

    public Integer getEmployLength() {
        return employLength;
    }

    public void setEmployLength(Integer employLength) {
        this.employLength = employLength;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}