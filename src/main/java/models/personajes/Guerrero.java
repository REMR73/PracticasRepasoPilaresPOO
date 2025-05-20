package models.personajes;
public class Guerrero extends Personaje {
    private int fuerza;
    private int defensa;

    public Guerrero(String nombre, int salud, int energia) {
        super(nombre, salud, energia);
        this.fuerza = 15;
        this.defensa = 10;
    }

    public Guerrero(String nombre) {
        super(nombre, 150, 80);  // Valores por defecto para un guerrero
        this.fuerza = 15;
        this.defensa = 10;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void atacar(Enemigo objetivo) {
        if (usarEnergia(10)) {
            int daño = fuerza * 2;
            System.out.println(getNombre() + " ataca con su espada a " + objetivo.getNombre() + " causando " + daño + " de daño");
            objetivo.recibirDaño(daño);
        }
    }

    public int defender() {
        if (usarEnergia(5)) {
            System.out.println(getNombre() + " se pone en posición defensiva");
            return defensa * 2;
        }
        return defensa;
    }
}

