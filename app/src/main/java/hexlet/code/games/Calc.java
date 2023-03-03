package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    private static int firsRandomNumber;
    private static int secondRandomNumber;
    private static String randomOperator;
    private int trueAnswer;


    public Calc() {
    }



    public static void condition() {
        System.out.println("What is the result of the expression?");
        firsRandomNumber = Engine.getRandomNumber(100);
        secondRandomNumber = Engine.getRandomNumber(100);
        randomOperator = Engine.getRandomOperator();
    }

    public static void getQuestion() {
        Engine.print("Question: " + firsRandomNumber + " " + randomOperator + " " + secondRandomNumber);
    }

    public static int getTrueAnswer() {
        int trueAnswer = 0;
        switch (randomOperator) {
            case ("+") :
                trueAnswer = firsRandomNumber + secondRandomNumber;
                break;
            case ("-") :
                trueAnswer = firsRandomNumber - secondRandomNumber;
                break;
            case ("*") :
                trueAnswer = firsRandomNumber * secondRandomNumber;
                break;
        }

        return trueAnswer;
    }
}
