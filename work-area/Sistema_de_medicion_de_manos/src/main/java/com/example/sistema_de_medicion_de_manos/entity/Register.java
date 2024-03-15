package com.example.sistema_de_medicion_de_manos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Register {
    @Id
long id;

    @OneToMany(mappedBy = "paciente")
    private List<Pacient> pacients;


}

