package com.example.fdefendapp;

public class Event {
    private String typeEvent;
    private String description;
    private String time;
    private int idEvent;
    private int idUser;
    private int idNotf;

    // Default constructor
    public Event() {
    }

    // Constructor with parameters
    public Event(String typeEvent, String description, String time, int idEvent, int idUser, int idNotf) {
        this.typeEvent = typeEvent;
        this.description = description;
        this.time = time;
        this.idEvent = idEvent;
        this.idUser = idUser;
        this.idNotf = idNotf;
    }

    // Getters and setters
    public String getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(String typeEvent) {
        this.typeEvent = typeEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdNotf() {
        return idNotf;
    }

    public void setIdNotf(int idNotf) {
        this.idNotf = idNotf;
    }

    // toString() method
    @Override
    public String toString() {
        return "Event{" +
                "typeEvent='" + typeEvent + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", idEvent=" + idEvent +
                ", idUser=" + idUser +
                ", idNotf=" + idNotf +
                '}';
    }
}
