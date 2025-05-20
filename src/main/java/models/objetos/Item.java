package models.objetos;

import models.personajes.Personaje;

public class Item {
    private String nombre;
    private String descripcion;
    private double peso;

    public Item(String nombre, String descripcion, double peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void usar(Personaje personaje) {
        System.out.println(personaje.getNombre() + " usa " + nombre);
    }
}

