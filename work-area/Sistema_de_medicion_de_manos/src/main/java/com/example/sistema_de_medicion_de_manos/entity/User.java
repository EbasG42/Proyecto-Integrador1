package com.example.sistema_de_medicion_de_manos.entity;
/**
 * La clase fue creada para organizar una jearquia de usuarios
 * recordemos que en el diagrama esta organizado de la siguiente manera
 * Admin
 * Doctor
 * Paciente
 *
 *
 */


abstract class User {
    private long id;
    private  String name;
    private String lastname;
    private String document;
    private String email;



    public User() {
    }

    public User(long id, String name, String lastname, String document, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.document = document;
        this.email = email;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
