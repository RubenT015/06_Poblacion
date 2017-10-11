package com.example.rt.a06_poblacion;

import android.graphics.Bitmap;
import android.net.Uri;

/**
 * Created by RT on 09/10/2017.
 */

public class Poblacion {
    private String ciudad,gentilicio, nHabitantes;
    private int bandera;

    public Poblacion(String ciudad, String gentilicio, String nHabitantes, int bandera) {
        this.ciudad = ciudad;
        this.gentilicio = gentilicio;
        this.bandera = bandera;
        this.nHabitantes = nHabitantes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public String getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(String nHabitantes) {
        this.nHabitantes = nHabitantes;
    }
}
