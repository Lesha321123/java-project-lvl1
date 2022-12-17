package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case (1) :
                System.out.println("Your choice: " + input);
                greeting();
                break;
            case (2) :
                System.out.println("Your choice: " + input);
                Even even = new Even(greeting());
                even.startGame();
                break;
            case (0) :
                break;
        }



    }

    public static String greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
