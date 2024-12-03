package com.supiri.Tikka.model;

public class Vendor {
    private int vendorID;
    private String vendorName;
    private String username;
    private String password;
    private String gmail;

    public Vendor(int vendorID, String vendorName, String username, String password, String gmail){
        this.vendorID=vendorID;
        this.vendorName=vendorName;
        this.username=username;
        this.password=password;
        this.gmail=gmail;
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
