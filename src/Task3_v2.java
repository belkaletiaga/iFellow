//Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
//и делает конвертацию.
//При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фарен
import java.util.Scanner;

public class Task3_v2 {
    static void main() {
        System.out.println("=== Конвертер температур из градусов по Цельсию в Кельвины, Фаренгейты ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру градусах по Цельсию: ");
        double celsius = scanner.nextDouble();
        System.out.print("Выберите тип конвертации (Введите K - Кельвины или F - Фаренгейты): ");
        String choice  = scanner.next();
        convert(celsius, choice);
    }
    private static void convert(double celsius,String choice ) {
        if (choice .equals("K")) {
            double convertK = celsius + 273.15;
            System.out.println("Температура в Кельвинах " + convertK);
        } else {
        if (choice .equals("F")) {
            double convertF = (celsius * 1.8) + 32;
            System.out.println("Температура в Фаренгейтах " + convertF);
        } else {
            System.out.println("Ошибка: Неверный выбор конвертации");
        }
        }
    }
}

