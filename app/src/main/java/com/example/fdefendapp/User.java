package com.example.fdefendapp;

public class User {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private int phoneNum;
        private String dateBirth;
        private String password;
        private int idEvent;
        private int idNotf;
    // Default constructor
    public User() {
    }

    // Constructor with parameters
    public User(int id, String firstName, String lastName, String email, int phoneNum,
                String dateBirth, String password, int idEvent, int idNotf) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.dateBirth = dateBirth;
        this.password = password;
        this.idEvent = idEvent;
        this.idNotf = idNotf;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
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
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                ", dateBirth='" + dateBirth + '\'' +
                ", password='" + password + '\'' +
                ", idEvent=" + idEvent +
                ", idNotf=" + idNotf +
                '}';
    }


}
