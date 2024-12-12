package com.supiri.Tikka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    private String  customerName;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int customerNo;
    private int ticketNo;

    public Customer(String customerName, int customerNo, int ticketNo){
        this.customerName=customerName;
        this.customerNo=customerNo;
        this.ticketNo=ticketNo;
    }

    public Customer() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerNo(){
        return getCustomerNo();
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
}
