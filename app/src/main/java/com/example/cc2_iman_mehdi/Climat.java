package com.example.cc2_iman_mehdi;

import java.io.Serializable;

public class Climat implements Serializable {


    private int id;
    private String nom_ville;
    private String pays;
    private int temperature;
    private int pourcentage;

    public Climat(int id, String nom_ville, String pays, int temperature, int pourcentage) {
        this.id = id;
        this.nom_ville = nom_ville;
        this.pays = pays;
        this.temperature = temperature;
        this.pourcentage = pourcentage;
    }


    public Climat() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_ville() {
        return nom_ville;
    }

    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }



}
