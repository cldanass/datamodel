package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;



@Entity
public class Client {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public com.wellsfargo.counselor.entity.Advisor getAdvisor() {
        return Advisor;
    }

    public void setAdvisor(com.wellsfargo.counselor.entity.Advisor advisor) {
        Advisor = advisor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    @ManyToOne
    private Advisor Advisor;

    public Client() {
        // Default constructor
    }

    public Client(String name, String contactInfo, Advisor financialAdvisor) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.Advisor = Advisor;
    }

    // Getters and setters (excluding id setter)
}
