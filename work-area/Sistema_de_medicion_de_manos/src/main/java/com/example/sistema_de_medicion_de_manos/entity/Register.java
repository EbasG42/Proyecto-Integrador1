package com.example.sistema_de_medicion_de_manos.entity;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Register {


    @OneToMany(mappedBy = "paciente")
    private List<Pacient> pacients;


}

