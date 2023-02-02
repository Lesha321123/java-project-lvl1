package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String name;

    public static void print(String text) {
        System.out.println(text);
    }

    public static int getRandomNumber(int number) {
        return  (int) (Math.random() * number);
    }

    public static String greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public String getName() {
        return name;
    }
}
