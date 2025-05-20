package models.personajes;

public class Mago extends Personaje {
    private int mana;
    private int inteligencia;

    public Mago(String nombre, int salud, int energia) {
        super(nombre, salud, energia);
        this.mana = 100;
        this.inteligencia = 20;
    }

    public Mago(String nombre) {
        super(nombre, 80, 150);  // Valores por defecto para un mago
        this.mana = 100;
        this.inteligencia = 20;
    }

    public int getMana() {
        return mana;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void atacar(Personaje objetivo) {
        if (usarEnergia(15)) {
            int daño = inteligencia * 3;
            System.out.println(getNombre() + " lanza una bola de fuego a " + objetivo.getNombre() + " causando " + daño + " de daño");
            objetivo.recibirDaño(daño);
        }
    }

    public void curar(Personaje objetivo) {
        if (usarEnergia(20)) {
            int curacion = inteligencia * 2;
            objetivo.setSalud(Math.min(100, objetivo.getSalud() + curacion));
            System.out.println(getNombre() + " cura a " + objetivo.getNombre() + " por " + curacion + " puntos");
        }
    }
}
