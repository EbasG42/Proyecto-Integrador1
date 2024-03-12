package com.example.sistema_de_medicion_de_manos.entity;
/**
 * la clase paciente va alamacenar la clase madre, el genero y contendra el resumen de la prueba
 *
 *


 */


public class Pacient extends User{

    private String gender;
    private Sample summary;

    public Pacient(){
        super();
    }

    public Pacient(long id, String name, String lastname,
                   String document, String email,
                   String gender, Sample summary) {
        super(id, name, lastname, document, email);
        this.gender = gender;
        this.summary = summary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Sample getSummary() {
        return summary;
    }

    public void setSummary(Sample summary) {
        this.summary = summary;
    }
}
