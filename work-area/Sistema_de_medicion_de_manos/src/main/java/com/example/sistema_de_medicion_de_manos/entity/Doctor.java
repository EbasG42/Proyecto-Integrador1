package com.example.sistema_de_medicion_de_manos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   long id;
    public Doctor(){
        super();
    }

    public Doctor( String name, String lastname, String document, String email) {
        super( name, lastname, document, email);
    }
}
