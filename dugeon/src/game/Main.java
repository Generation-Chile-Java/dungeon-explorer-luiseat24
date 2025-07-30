package game;

import model.Player;
import room.EmptyRoom;
import room.EnemyRoom;
import room.Room;
import room.TreasureRoom;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tu nombre: ");
        String name = scanner.nextLine();
        Player player = new Player(name, 100);

        Room[] dugeon = {
                new EmptyRoom(),
                new TreasureRoom("Espada de Fuego"),
                new EnemyRoom(30),
                new TreasureRoom("Poción de Vida"),
                new EnemyRoom(50),
                new EmptyRoom()
        };

        System.out.println("\n¡Comienza la exploracion de la mazmorra!");

        for (int i = 0; i < dugeon.length && player.isAlive(); i++) {
            System.out.println("\nEntrando en la sala " + (i + 1) + "...");
            dugeon[i].enter(player);
            player.showStatus();
            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }

        if (player.isAlive()) {
            System.out.println("\n¡Felicidades! Has explorado toda la mazmorra.");
        } else {
            System.out.println("\nHas muerto. Fin del juego");
        }

        scanner.close();

    }
}