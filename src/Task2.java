// Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»

public class Task2 {
    static void main() {
        System.out.println("=== Вывод повторяющихся символов в слове ===");
        String word = "Hello";
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            for (int j = i+1; j < word.length(); j++) {
                if (c == letters[j]) {
                    System.out.println(c);
                }
            }
        }
    }
}
