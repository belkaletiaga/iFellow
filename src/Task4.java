//Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
//На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
//Расчет угла производить относительно реального поведения стрелок часов.

import java.util.Scanner;

public class Task4 {
    private static final int CIRCLEDEGREE = 360;
    private static final int MINUTEINHOURS = 60;

    static void main() {
        System.out.println("=== Вычисление угла, который образуют часовая и минутная стрелки ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();
        // Если введено время в 24 часовом формате
        if (hours > 12 & hours < 24) {
            hours = hours - 12;
        }

        if (hours >= 24 ) {
            System.out.println("Программа завершена");
            return;
        }
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();
        if (minutes > 59 ) {
            System.out.println("Программа завершена");
            return;
        }
        printAngle(calculationAngle(hours, minutes));
    }

    static double calculationAngle(int hours, int minutes) {
        // Вычисляем угол часовой стрелки (30° за каждый час) + зависимость от расположения минутной
        double hoursAngle = (hours * 30) + (minutes * 30.0/ MINUTEINHOURS);
        // Вычисляем угол минутной стрелки (каждая минута 6 гр)
        double minuteAngle = 1.0 * minutes * CIRCLEDEGREE / MINUTEINHOURS;
        // Вычисляем разницу между углами
        double angle =  Math.abs(hoursAngle - minuteAngle);

        if (angle > 180) {
            angle = CIRCLEDEGREE - angle;
        }
        return angle;
    }
    static void printAngle(double angle) {
        // Проверяем является ли угол целым числом
        if (Math.abs(angle - Math.round(angle)) < 0.001) {
            System.out.printf("Угол между стрелками: %.0f°%n", angle);
        } else {
            System.out.printf("Угол между стрелками: %.1f°%n", angle);
        }
    }
}
