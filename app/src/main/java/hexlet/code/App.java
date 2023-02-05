package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Engine.print("Please enter the game number and press Enter.");
        Engine.print("1 - Greet");
        Engine.print("2 - Even");
        Engine.print("3 - Calc");
        Engine.print("0 - Exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case (1) :
                Engine.print("Your choice: " + input);
                Engine.greeting();
                break;
            case (2) :
                Engine.print("Your choice: " + input);
                Engine.greeting();
                Even even = new Even();
                even.startGame();
                break;
            case (3) :
                Engine.print("Your choice: " + input);
                Engine.greeting();
                Calc calc = new Calc();
                calc.startGame();
                break;
            case (0) :
                break;
        }



    }

}
