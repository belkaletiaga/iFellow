//Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
//и делает конвертацию.
//При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты

import java.util.Scanner;

public class BaseConverter {
    private static final int EXIT = 0;
    private static final int KELVIN = 1;
    private static final int FAHRENHEIT = 2;

    static void main() {
        System.out.println("=== Конвертер температур из градусов по Цельсию в Кельвины, Фаренгейты ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру градусах по Цельсию: ");
        double celsius = scanner.nextDouble();
        System.out.println("Выберите тип конвертации: ");
        System.out.print("Введите " + KELVIN + " - для конвертации в Кельвины или "
                + FAHRENHEIT + " - в Фаренгейты: " + EXIT + " - для выхода: ");
        int choice  = scanner.nextInt();

        if (choice == EXIT) {
            System.out.println("Программа завершена");
            return;
        }
        convert(celsius, choice);
    }

    static void convert(double celsius, int choice) {
        switch  (choice) {
            case KELVIN:
                double kelvin  = celsius + 273.15;
                System.out.printf("Температура в Кельвинах: %.2f K%n", kelvin );
                break;
            case FAHRENHEIT:
                double fahrenheit  = (celsius * 9/5 ) + 32;
                System.out.printf("Температура в Фаренгейтах: %.2f °F%n", fahrenheit);
                break;
            default:
                System.out.println("Ошибка: Неверный выбор типа конвертации");
        }
    }
}
