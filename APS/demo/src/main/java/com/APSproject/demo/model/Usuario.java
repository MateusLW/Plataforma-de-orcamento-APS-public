package com.APSproject.demo.model;

import jakarta.persistence.*;

@Entity(name = "usuarios")
@Table(name = "usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int  id;

    String username;
    String password;

    public Usuario() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
