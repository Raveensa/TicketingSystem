package com.supiri.Tikka.model.ticket;

import com.supiri.Tikka.model.Event;

public class Ticket {
    private int TicketNo;
    private int TicketPrice;
    private Event event;
    public Ticket(int TicketNo, int TicketPrice, Event event){
        this.TicketNo=TicketNo;
        this.TicketPrice=TicketPrice;
        this.event=event;
    }

    public int getTicketNo() {
        return TicketNo;
    }

    public void setTicketNo(int ticketNo) {
        TicketNo = ticketNo;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        TicketPrice = ticketPrice;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
