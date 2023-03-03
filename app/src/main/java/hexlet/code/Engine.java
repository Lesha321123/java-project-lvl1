package hexlet.code;

import hexlet.code.games.Calc;

import java.util.Scanner;

public class Engine {

    private int countTrueAnswers;
    public static int intTrueAnswer;
    public static int trueAnswer;
    public static int answer;
    public static String name;

    static Scanner sc = new Scanner(System.in);

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while (countTrueAnswers < 3) {


            Calc.condition();

            Engine.trueAnswer = Calc.getTrueAnswer();
            Calc.getQuestion();

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

    public static void taskCondition(String condition) {
        System.out.println(condition);
    }

    public static String getRandomOperator() {
        String[] arrayOperators = new String[]{"+", "-", "*"};
        int randomChoice = (int) (Math.random() * 3);
        return  arrayOperators[randomChoice];
    }



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
    public static void alertWin() {
        Engine.print("Congratulations, " + name + "!");
    }

    public static void alertDefeat() {
        Engine.print(answer + " is wrong answer ;(. Correct answer was " + trueAnswer + ".");
        Engine.print("Let's try again, " + Engine.name + "!");
    }


    public String getName() {
        return name;
    }

}
