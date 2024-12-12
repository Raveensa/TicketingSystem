package com.supiri.Tikka.model.ticket;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VIPTicket {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
