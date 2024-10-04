package se.mathias.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("===========================");
        System.out.println("Välkommen till tärningspel");
        System.out.println("===========================");

        System.out.println("Vänligen knappa in ditt namn spelare 1");
        String playerOneName = sc.nextLine();
        Player player1 = new Player(playerOneName);
        System.out.println("Välommen " + player1.getplayerName() + "\n");

        System.out.println("Vänligen knappa in namn på spelare 2");
        String playerTwoName = sc.nextLine();
        Player player2 = new Player(playerTwoName);
        System.out.println("Välommen " + player2.getplayerName() + "\n");

        System.out.println("Varje spelare kastar 2 gånger och den som får högst summa vinner.\n");

        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int roll3 = random.nextInt(6) + 1;
        int roll4 = random.nextInt(6) + 1;
        int summa1 = roll1 + roll2;
        int summa2 = roll3 + roll4;

        System.out.println(player1.getplayerName() + " börjar. Är du redo?");
        System.out.println("Tryck 1 för att starta rundan.");
        sc.nextInt();
        System.out.println(player1.getplayerName() + " kastade: " + roll1);
        System.out.println(player1.getplayerName() + " kastade: " + roll2);
        System.out.println(player1.getplayerName() + " fick: " + summa1 + "\n");

        System.out.println(player2.getplayerName() + " din tur. Är du redo?");
        System.out.println("Tryck 1 för att starta rundan.");
        sc.nextInt();
        System.out.println("Du kastade: " + roll3);
        System.out.println("Du kastade: " + roll4);
        System.out.println(player2.getplayerName() + " fick: " + summa2 + "\n");

        System.out.println(player1.getplayerName() + " summa: " + summa1);
        System.out.println(player2.getplayerName() + " summa: " + summa2);

        if (summa1 > summa2) {
            System.out.println(player1.getplayerName() + " fick högst poäng och vann!");
        } else if (summa2 > summa1) {
            System.out.println(player2.getplayerName() + " fick högst poäng och vann!");
        } else {
            System.out.println("Det blev lika");
        }
    }

}





