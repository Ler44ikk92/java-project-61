package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        System.out.println("Your choice: " + num);

        if (num.equals("1")) {
            Engine.game1(scanner);
        } else if (num.equals("2")) {
            Engine.game2(scanner);
        } else if (num.equals("3")) {
            Engine.game3(scanner);
        } else if (num.equals("4")) {
            Engine.game4(scanner);
        }  else if (num.equals("5")) {
            Engine.game5(scanner);
        } else if (num.equals("6")) {
            Engine.game6(scanner);
        }
        scanner.close();
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }

    public static void game1(Scanner scanner) {
        Engine.welcomeMessage();
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void game2(Scanner scanner) {
        Engine.welcomeMessage();
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 3;
        int roundRandom = 100;
        int n = 0;
        for (var i = 0; i < count; i++) {
            var rand = Math.round(Math.random() * roundRandom);
            System.out.println("Question: " + rand);
            String correctAnswer;
            if (rand % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (!correctAnswer.equals(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            n += 1;
        }
        if (n == count) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }

    public static void game3(Scanner scanner) {
        Engine.welcomeMessage();
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        int count = 3;
        int n = 0;
        int roundRandom = 10;
        for (var i = 0; i < count; i++) {
            var n1 = Math.round(Math.random() * roundRandom);
            var n2 = Math.round(Math.random() * roundRandom);
            String chars = "+-*";
            Random rnd = new Random();
            char c = chars.charAt(rnd.nextInt(chars.length()));
            var result = 0;
            String text = "";
            switch (c) {
                case '+':
                    result = (int) (n1 + n2);
                    text = n1 + " + " + n2;
                    break;
                case '-':
                    result = (int) (n1 - n2);
                    text = n1 + " - " + n2;
                    break;
                case '*':
                    result = (int) (n1 * n2);
                    text = n1 + " * " + n2;
                    break;
                default: break;
            }
            System.out.println("Question: " + text);

            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (result != Integer.parseInt(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            n += 1;
        }

        if (n == count) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }

    public static void game4(Scanner scanner) {
        Engine.welcomeMessage();
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        int n = 0;
        int count = 3;
        int roundRandom = 100;
        int r = 1;
        for (var i = 0; i < count; i++) {
            var n1 = Math.round(Math.random() * roundRandom) + r;
            var n2 = Math.round(Math.random() * roundRandom) + r;
            System.out.println("Question: " + n1 + " " + n2);
            while (n2 != 0) {
                int temp = (int) n2;
                n2 = n1 % n2;
                n1 = temp;
            }
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (n1 != Integer.parseInt(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + n1);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            n += 1;
        }
        if (n == count) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }

    public static void game5(Scanner scanner) {
        Engine.welcomeMessage();
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");
        int n = 0;
        int count = 3;
        int roundRandom = 10;
        int r = 1;
        for (var i = 0; i < count; i++) {
            int k = 0;
            int n2 = 0;
            int h = 0;
            var randStep = Math.round(Math.random() * roundRandom); //random step
            int min = 5;
            int max = 10;
            Random rand = new Random();
            int randLen = rand.nextInt(max - min + r) + min;
            Random rand2 = new Random();
            int randHint = rand2.nextInt(randLen - r + r) + r;
            System.out.print("Question: ");
            while (k < randLen) {
                n2 = (int) randStep + n2;
                k += 1;
                if (randHint == k) {
                    h = n2;
                    System.out.print(".. ");

                } else {
                    System.out.print(n2 + " ");
                }
            }
            System.out.println(" ");
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (h != Integer.parseInt(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + h);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            n += 1;
        }
        if (n == count) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }

    public static void game6(Scanner scanner) {
        Engine.welcomeMessage();
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int count = 3;
        int roundRandom = 20;
        int n = 0;
        for (var i = 0; i < 3; i++) {
            int k = 0;
            var h = "";
            //var rand = Math.round(Math.random() * roundRandom); //random step
            var rand = 2;
            for (var j = 2; j <= rand; j++) {
                if (rand % j  == 0) {
                    k = k + 1;
                }
            }
            if (k > 1) {
                h = "no";
            } else {
                h = "yes";
            }
            System.out.println("Question: " + rand);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(h)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + h);
                System.out.println("Let's try again, " + userName + "!");
                //break;
            } else {
                System.out.println("Correct!");
            }
            n += 1;
        }
        if (n == count) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}
