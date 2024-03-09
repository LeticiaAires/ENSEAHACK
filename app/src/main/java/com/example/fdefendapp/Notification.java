package com.example.fdefendapp;

public class Notification {
    private int idNotf;
    private String timeNotf;
    private int dateNotf;
    private String descNotf;
    private int idEvent;
    private int id;

    // Default constructor
    public Notification() {
    }

    // Constructor with parameters
    public Notification(int idNotf, String timeNotf, int dateNotf, String descNotf, int idEvent, int id) {
        this.idNotf = idNotf;
        this.timeNotf = timeNotf;
        this.dateNotf = dateNotf;
        this.descNotf = descNotf;
        this.idEvent = idEvent;
        this.id = id;
    }

    // Getters and setters
    public int getIdNotf() {
        return idNotf;
    }

    public void setIdNotf(int idNotf) {
        this.idNotf = idNotf;
    }

    public String getTimeNotf() {
        return timeNotf;
    }

    public void setTimeNotf(String timeNotf) {
        this.timeNotf = timeNotf;
    }

    public int getDateNotf() {
        return dateNotf;
    }

    public void setDateNotf(int dateNotf) {
        this.dateNotf = dateNotf;
    }

    public String getDescNotf() {
        return descNotf;
    }

    public void setDescNotf(String descNotf) {
        this.descNotf = descNotf;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // toString() method
    @Override
    public String toString() {
        return "Notification{" +
                "idNotf=" + idNotf +
                ", timeNotf='" + timeNotf + '\'' +
                ", dateNotf=" + dateNotf +
                ", descNotf='" + descNotf + '\'' +
                ", idEvent=" + idEvent +
                ", id=" + id +
                '}';
    }
}
