package models.objetos;

import models.personajes.Personaje;

public class Arma extends Item {
    private int daño;

    public Arma(String nombre, String descripcion, double peso, int daño) {
        super(nombre, descripcion, peso);
        this.daño = daño;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public void usar(Personaje personaje) {
        System.out.println(personaje.getNombre() + " equipa " + getNombre());
        // Aquí se podría implementar lógica para equipar el arma
    }
}
