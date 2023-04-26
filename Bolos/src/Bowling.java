import java.util.*;

// Clase Bowling
public class Bowling {
    // HashMap para almacenar el nombre y los puntos de los jugadores
    HashMap<String, Integer> players;

    // Constructor de la clase
    Bowling() {
        players = new HashMap<String, Integer>();
    }

    // Método para añadir un jugador al HashMap
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    // Método para obtener al ganador del juego
    public void getWinner() {
        // Inicializar variables para almacenar el nombre y los puntos del ganador
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        // Iterar sobre los jugadores y encontrar al que tiene más puntos
        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() > maxPoints) {
                maxPoints = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Imprimir el nombre del ganador
        System.out.println(winner);
    }
}
