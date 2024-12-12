package com.supiri.Tikka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organizer {
    @Id
    private int organizerID;
    private String organizerName;
    private String username;
    private String password;
    private String gmail;

    public Organizer(int organizerID, String organizerName, String username, String password, String gmail){
        this.organizerID=organizerID;
        this.organizerName=organizerName;
        this.username=username;
        this.password=password;
        this.gmail=gmail;
    }

    public Organizer() {

    }

    public int getOrganizerID() {
        return organizerID;
    }

    public void setOrganizerID(int organizerID) {
        this.organizerID = organizerID;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
