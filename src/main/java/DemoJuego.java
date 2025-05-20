import models.objetos.Arma;
import models.objetos.Pocion;
import models.personajes.Arquero;
import models.personajes.Enemigo;
import models.personajes.Guerrero;
import models.personajes.Mago;

public class DemoJuego {
    public static void main(String[] args) {
        System.out.println("\n=== DEMOSTRACIÓN DEL SISTEMA DE VIDEOJUEGO ===\n");

        // Crear personajes
        Guerrero guerrero = new Guerrero("Aragorn");
        Mago mago = new Mago("Gandalf");
        Arquero arquero = new Arquero("Legolas");

        // Crear enemigo
        Enemigo orco = new Enemigo("Orco de las nieves", 100, 120, 100);

        // Crear objetos
        Pocion pocionCuracion = new Pocion("Poción de curación", "Restaura 30 puntos de salud", 0.5, 30);
        Arma espada = new Arma("Espada larga", "Una poderosa espada de acero", 5, 15);

        // Demostrar combate
        System.out.println("--- Ronda 1 ---");
        guerrero.atacar(orco);
        orco.atacar(guerrero);

        System.out.println("\n--- Ronda 2 ---");
        mago.atacar(orco);
        arquero.atacar(orco);

        System.out.println("\n--- Uso de objetos ---");
        pocionCuracion.usar(guerrero);
        espada.usar(guerrero);

        System.out.println("\n--- Habilidades especiales ---");
        mago.curar(arquero);

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}