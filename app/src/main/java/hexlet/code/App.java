package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input) {
            case ("1") :
                System.out.println("Your choice: " + input);
                Cli.greeting();
                break;
            case ("0") :
                break;
        }



    }
}
