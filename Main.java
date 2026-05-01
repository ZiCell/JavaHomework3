import java.util.Scanner;

public class Main {

    public static int calcLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println();
        System.out.println("Привет! Хочешь поиграть?");
        System.out.println();
        System.out.println("Давай проверим, как ты умеешь считать високосность года.");
        System.out.println("Эта комната начнёт заполняться ядовитым газом, ");
        System.out.println("как только ты ошибёшься.");
        System.out.println();

        while (true) {

            System.out.print("Напиши любой год: ");
            int year = scanner.nextInt();

            System.out.println();

            System.out.print("И сколько в нём дней?: ");
            int days = scanner.nextInt();

            System.out.println();

            int isLeap = calcLeap(year);

            int correctAnswer = 365 + calcLeap(year);

            if (days == correctAnswer) {
                score++;
            } else {
                System.out.println("Упс! Неа.");
                System.out.println ("Правильных ответов: " + score);
                System.out.println ("Ну всё, пока!");
                break;
            }
        }
    }
}