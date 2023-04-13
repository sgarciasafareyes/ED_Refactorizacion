package Ejercicio2;

/**
 * A continuación tiene un fragmento de un juego, en concreto la clase que se encarga de ver el movimiento que se desea hacer y mover las coordenadas del jugador en dicha dirección (considerando que el punto 0,0 está arriba a la izquierda). Identifique qué refactorizaciones se pueden realizar en ambas clases.
 */
public class Game {
    Player p;

    //...

    public void movement(String m) {
        if (m.equalsIgnoreCase("Derecha")) {
            p.setX(p.getX() + 1);
        }
        if (m.equalsIgnoreCase("Izquierda")) {
            p.setX(p.getX() - 1);
        }
        if (m.equalsIgnoreCase("Arriba")) {
            p.setX(p.getX() - 1);
        }
        if (m.equalsIgnoreCase("Abajo")) {
            p.setX(p.getX() + 1);
        }
    }
}
