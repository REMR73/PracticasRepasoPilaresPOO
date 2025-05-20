package models.objetos;

import models.personajes.Personaje;

public class Pocion extends Item {
    private int cantidadCuracion;

    public Pocion(String nombre, String descripcion, double peso, int cantidadCuracion) {
        super(nombre, descripcion, peso);
        this.cantidadCuracion = cantidadCuracion;
    }

    @Override
    public void usar(Personaje personaje) {
        int nuevaSalud = Math.min(100, personaje.getSalud() + cantidadCuracion);
        personaje.setSalud(nuevaSalud);
        System.out.println(personaje.getNombre() + " usa " + getNombre() + " y recupera " + cantidadCuracion + " de salud. Salud actual: " + personaje.getSalud());
    }
}
