package models.personajes;

public class Personaje {
    // Atributos privados (encapsulados)
    private String nombre;
    private int salud;
    private int energia;
    private int nivel;

    // Constructor
    public Personaje(String nombre, int salud, int energia) {
        this.nombre = nombre;
        this.salud = salud;
        this.energia = energia;
        this.nivel = 1;
    }

    // Constructor con valores por defecto
    public Personaje(String nombre) {
        this(nombre, 100, 100);
    }

    // Getters (accesores)
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    // Setters (mutadores)
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre debe ser una cadena no vacía");
        }
    }

    public void setSalud(int salud) {
        if (salud >= 0 && salud <= 100) {
            this.salud = salud;
        } else {
            System.out.println("La salud debe estar entre 0 y 100");
        }
    }

    public void recibirDaño(int cantidad) {
        if (cantidad > 0) {
            this.salud = Math.max(0, this.salud - cantidad);
            System.out.println(this.nombre + " recibió " + cantidad + " de daño. Salud actual: " + this.salud);
        }
    }

    public boolean usarEnergia(int cantidad) {
        if (cantidad > 0 && cantidad <= this.energia) {
            this.energia -= cantidad;
            return true;
        } else {
            System.out.println(this.nombre + " no tiene suficiente energía");
            return false;
        }
    }

    public void descansar() {
        this.energia = Math.min(100, this.energia + 25);
        System.out.println(this.nombre + " descansó. Energía actual: " + this.energia);
    }
}
