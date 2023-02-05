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

            Engine.taskCondition("What is the result of the expression?");

            firsRandomNumber = Engine.getRandomNumber(100);
            secondRandomNumber = Engine.getRandomNumber(100);
            randomOperator = getRandomOperator();
            Engine.trueAnswer = getTrueAnswer();
            Engine.print("Question: " + firsRandomNumber + " " + randomOperator + " " + secondRandomNumber);

            Engine.print("Your answer:");
            Engine.answer = sc.nextInt();

            if (Engine.answer == trueAnswer) {
                Engine.print("Correct!");
                countTrueAnswers++;
                if(countTrueAnswers == 3) {
                    Engine.alertWin();
                    break;
                }
            } else {
                Engine.alertDefeat();
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
