package models.personajes;

public class Arquero extends Personaje {
    private int destreza;
    private int flechas;

    public Arquero(String nombre, int salud, int energia) {
        super(nombre, salud, energia);
        this.destreza = 18;
        this.flechas = 20;
    }

    public Arquero(String nombre) {
        super(nombre, 100, 120);  // Valores por defecto para un arquero
        this.destreza = 18;
        this.flechas = 20;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int cantidad) {
        if (cantidad >= 0) {
            this.flechas = cantidad;
        }
    }

    public void atacar(Personaje objetivo) {
        if (flechas > 0 && usarEnergia(8)) {
            flechas--;
            double daño = destreza * 2.5;
            System.out.println(getNombre() + " dispara una flecha a " + objetivo.getNombre() + " causando " + daño + " de daño. Flechas restantes: " + flechas);
            objetivo.recibirDaño((int) daño);
        } else if (flechas <= 0) {
            System.out.println(getNombre() + " no tiene flechas");
        }
    }
}
