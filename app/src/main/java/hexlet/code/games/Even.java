package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    private int randomNumber;
    private int countTrueAnswers;
    private String trueAnswer;

    public Even() {

    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (countTrueAnswers < 3) {
            Engine.print("Answer 'yes' if the number is even, otherwise answer 'no'.");
            randomNumber = Engine.getRandomNumber(10);
            isTrueAnswer();
            Engine.print("Question: " + randomNumber);
            Engine.print("Your answer:");
            String answer = sc.nextLine();
            if (answer.equals(trueAnswer)) {
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

    public void isTrueAnswer() {
        if(randomNumber % 2 == 0) {
            trueAnswer = "yes";
        } else {
            trueAnswer = "no";
        }
    }


}
