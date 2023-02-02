package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    private int firsRandomNumber;
    private int secondRandomNumber;
    private String randomOperator;
    private int countTrueAnswers;
    private int trueAnswer;


    public Calc() {
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (countTrueAnswers < 3) {
            Engine.print("What is the result of the expression?");
            firsRandomNumber = Engine.getRandomNumber(100);
            secondRandomNumber = Engine.getRandomNumber(100);
            randomOperator = getRandomOperator();
            trueAnswer = getTrueAnswer();
            Engine.print("Question: " + firsRandomNumber + " " + randomOperator + " " + secondRandomNumber);
            Engine.print("Your answer:");
            int answer = sc.nextInt();
            if (answer == trueAnswer) {
                Engine.print("Correct!");
                countTrueAnswers++;
                if(countTrueAnswers == 3) {
                    Engine.print("Congratulations, " + Engine.name + "!");
                    break;
                }
            } else {
                Engine.print(answer + " is wrong answer ;(. Correct answer was " + trueAnswer + ".");
                Engine.print("Let's try again, " + Engine.name + "!");
                break;
            }
        }
        sc.close();
    }

    public String getRandomOperator() {
        String[] arrayOperators = new String[]{"+", "-", "*"};
        int randomChoice = (int) (Math.random() * 3);
        return  arrayOperators[randomChoice];
    }

    public int getTrueAnswer() {
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
