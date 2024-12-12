package com.supiri.Tikka.model;

import CLI.TicketPool;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vendors
{
    @Id
    private int vendorID;
    private String vendorName;
    private String username;
    private String password;
    private String gmail;

    public Vendors(int vendorID, String vendorName, String username, String password, String gmail){
        this.vendorID=vendorID;
        this.vendorName=vendorName;
        this.username=username;
        this.password=password;
        this.gmail=gmail;
    }

    public Vendors() {

    }

    public Vendors(int i, int vendorTickets, int ticketReleaseRate, TicketPool ticketPool) {
    }

    public Vendors(int totalTickets, TicketPool ticketPool, int ticketReleaseRate) {
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getUsername(String username){
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
