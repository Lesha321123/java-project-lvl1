package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    private int firsRandomNumber;
    private int secondRandomNumber;
    private String randomOperator;
    private int countTrueAnswers;
    private int trueAnswer;
    private String name;

    public Calc(String name) {
        this.name = name;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (countTrueAnswers < 3) {
            System.out.println("What is the result of the expression?");
            firsRandomNumber = getRandomNumber();
            secondRandomNumber = getRandomNumber();
            randomOperator = getRandomOperator();
            trueAnswer = getTrueAnswer();
            System.out.println("Question: " + firsRandomNumber + " " + randomOperator + " " + secondRandomNumber);
            System.out.println("Your answer:");
            int answer = sc.nextInt();
            if (answer == trueAnswer) {
                System.out.println("Correct!");
                countTrueAnswers++;
                if(countTrueAnswers == 3) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer + ".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        sc.close();
    }

    public int getRandomNumber() {
        return  (int) (Math.random() * 100);
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
