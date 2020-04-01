package com.androidwave.cleancode.data.network.pojo;

public class Booking {
    private Hour hour;
    private User user;
    private String patientName;
    private String patientCase;

    public Booking(Hour hour, User user, String patientName, String patientCase) {
        this.hour = hour;
        this.user = user;
        this.patientName = patientName;
        this.patientCase = patientCase;
    }

    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientCase() {
        return patientCase;
    }

    public void setPatientCase(String patientCase) {
        this.patientCase = patientCase;
    }
}
