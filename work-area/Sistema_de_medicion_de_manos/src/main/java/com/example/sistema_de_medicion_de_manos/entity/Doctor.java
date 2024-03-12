package com.example.sistema_de_medicion_de_manos.entity;

public class Doctor extends User{

    public Doctor(){
        super();
    }

    public Doctor(long id, String name, String lastname, String document, String email) {
        super(id, name, lastname, document, email);
    }
}
