package models.personajes;

import interfaces.Combatiente;

public class Enemigo extends Personaje implements Combatiente {
    private int poder;

    public Enemigo(String nombre, int salud, int energia, int poder) {
        super(nombre, salud, energia);
        this.poder = poder;
    }

    public Enemigo(String nombre, int poder) {
        super(nombre); // Usa el constructor por defecto: salud = 100, energia = 100
        this.poder = poder;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int daño = poder;
        System.out.println("El enemigo " + getNombre() + " ataca a " + objetivo.getNombre() + " por " + daño + " de daño");
        objetivo.recibirDaño(daño);
    }

    @Override
    public void recibirDaño(int cantidad) {
        setSalud(Math.max(0, getSalud() - cantidad));
        System.out.println("El enemigo " + getNombre() + " recibe " + cantidad + " de daño. Salud restante: " + getSalud());
    }

    @Override
    public boolean estaVivo() {
        return getSalud() > 0;
    }
}
