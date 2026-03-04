// Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
// Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].
import java.util.Arrays;

public class Task1 {

    static void main() {

        double[] array = new double[10];

        // Заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        // Находим максимальное значение
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Находим минимальное значение
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        // Находим среднее значение
        double sum = 0;
        for (double arr : array) {
            sum += arr;
        }
        double average = sum / array.length;


        System.out.println("Сгенерированный массив:\n" + Arrays.toString(array));
        System.out.println("\nМаксимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение:" + average);
    }
}
