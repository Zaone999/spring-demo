package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String description;
    public Flight() {
    }
    public Flight(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
