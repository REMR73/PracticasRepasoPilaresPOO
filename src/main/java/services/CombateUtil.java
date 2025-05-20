package services;

import models.personajes.*;

public class CombateUtil {
    public static void iniciarCombate(Personaje atacante, Personaje defensor) {
        System.out.println("\n--- Combate entre " + atacante.getNombre() + " y " + defensor.getNombre() + " ---");
        // Polimorfismo: aquí necesitaríamos que el método atacar() esté en una interfaz común
        // En Java, necesitamos usar una interfaz o una clase abstracta para implementar este polimorfismo

        // Si tuviéramos una interfaz Atacante con método atacar:
        // ((Atacante)atacante).atacar(defensor);

        // En este caso específico:
        if (atacante instanceof Guerrero) {
            ((Guerrero)atacante).atacar((Enemigo) defensor);
        } else if (atacante instanceof Mago) {
            ((Mago)atacante).atacar(defensor);
        } else if (atacante instanceof Arquero) {
            ((Arquero)atacante).atacar(defensor);
        }
    }
}