import java.util.Scanner;

// Clase ejecutable
public class Main {
    public static void main(String[] args) {
        // Crear objeto Bowling
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        // Tomar datos de los jugadores como input y agregarlos al juego
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }

        // Obtener al ganador del juego e imprimir su nombre
        game.getWinner();
    }
}