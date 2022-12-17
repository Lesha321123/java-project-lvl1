package hexlet.code.games;

import java.util.Scanner;

public class Even {

    private int randomNumber;
    private int countTrueAnswers;
    private String trueAnswer;
    private String name;

    public Even(String name) {
        this.name = name;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (countTrueAnswers < 3) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            getRandomNumber();
            isTrueAnswer();
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer:");
            String answer = sc.nextLine();
            if (answer.equals(trueAnswer)) {
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

    public void getRandomNumber() {
        randomNumber = (int) (Math.random() * 10);
    }

    public void isTrueAnswer() {
        if(randomNumber % 2 == 0) {
            trueAnswer = "yes";
        } else {
            trueAnswer = "no";
        }
    }


}
