# 🎮 Taller: Los 4 Pilares de POO - Videojuego

Este proyecto fue desarrollado como parte del bootcamp de Java de la organización **Kodigo**. Su objetivo es reforzar los conceptos fundamentales de la **Programación Orientada a Objetos (POO)** mediante la simulación de un sistema de videojuego básico con personajes, combate e ítems.

## 📘 Descripción

Este videojuego de consola demuestra los **cuatro pilares de la POO** en Java:

| Pilar          | Definición                                                                 |
|----------------|---------------------------------------------------------------------------|
| 🔒 Encapsulamiento | Ocultamiento de datos internos de un objeto mediante métodos públicos controlados. |
| 🧬 Herencia         | Reutilización de código permitiendo que una clase hija herede de una clase padre.   |
| 🔄 Polimorfismo     | Permite usar el mismo método en diferentes objetos, generando comportamientos distintos. |
| 📝 Abstracción      | Simplificación de un sistema complejo a través de interfaces o clases abstractas.     |

## 🧠 Estructura del Proyecto

El proyecto incluye:

- ✔️ Clases para diferentes personajes: `Guerrero`, `Mago`, `Arquero`
- ✔️ Clases de ítems: `Item`, `Pocion`, `Arma`
- ✔️ Mecánica de combate entre personajes y enemigos
- ✔️ Interfaz `Combatiente` como ejemplo de abstracción
- ✔️ Clase de utilidad `CombateUtil` para simular escenarios

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java 24
- **IDE**: IntelliJ IDEA
- **Paradigma**: Programación Orientada a Objetos (POO)
- **Nivel**: Introductorio/intermedio

---

## ⚙️ Instrucciones para Ejecutar el Proyecto

1. Clona este repositorio (requiere permisos si es privado):

   ```bash
   git clone git@github.com:[organizacion]/[repositorio].git
   ```
 2. Abre el proyecto en IntelliJ IDEA.
    Asegúrate de estar utilizando Java 24 como SDK.

3. Ejecuta la clase DemoJuego.java para iniciar la demostración del sistema.

## 🧱 Esquema de Arquitectura del Proyecto
```
src/
└── main/
    └── java/
        ├── interfaces/
        │   └── Combatiente.java          # Interfaz para abstracción
        ├── models/
        │   ├── objetos/
        │   │   ├── Arma.java             # Hereda de Item
        │   │   ├── Item.java             # Clase base de objetos
        │   │   └── Pocion.java           # Hereda de Item
        │   └── personajes/
        │       ├── Arquero.java          # Hereda de Personaje
        │       ├── Enemigo.java          # Implementa Combatiente
        │       ├── Guerrero.java         # Hereda de Personaje
        │       ├── Mago.java             # Hereda de Personaje
        │       └── Personaje.java        # Clase base con encapsulamiento
        ├── services/
        │   └── CombateUtil.java          # Métodos de ayuda para simular combates
        └── DemoJuego.java                # Punto de entrada principal
```
## 🛠️ Diagrama UML de las clases
![image](https://github.com/user-attachments/assets/fd026fd1-ce54-49da-82e5-55a894bbf1d5)

