package com.supiri.Tikka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {
    private String eventname;
    private int eventdate;
    private String eventlocation;

    public Event(String eventlocation, String eventname, int eventdate){
        this.eventdate=eventdate;
        this.eventlocation=eventlocation;
        this.eventname=eventname;
    }

    public int getEventdate() {
        return eventdate;
    }

    public void setEventdate(int eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getEventlocation() {
        return eventlocation;
    }

    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }
}
