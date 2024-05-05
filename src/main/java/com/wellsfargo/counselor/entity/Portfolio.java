package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;



@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Portfolio() {
        // Default constructor
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    // Getters and setters (excluding id setter)
}
