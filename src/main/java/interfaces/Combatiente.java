package interfaces;

import models.personajes.Personaje;

public interface Combatiente {
    void atacar(Personaje objetivo);
    void recibirDaño(int cantidad);
    boolean estaVivo();
}