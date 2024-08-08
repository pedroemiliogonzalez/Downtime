/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketmanagementsystem;

/**
 *
 * @author USER
 */
public class Ticket {
    private int id;
    private String description;
    private String status;

    // Constructor, getters y setters
    public Ticket(int id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}