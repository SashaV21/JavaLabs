package Lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод строки
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Выводим символы, не представленные в ASCII, и их коды в Юникоде
        System.out.println("Символы, не представленные в ASCII:");
        printNonASCIICharacters(input);

        // Закрываем Scanner
        scanner.close();
    }

    // Метод для вывода символов, не представленных в ASCII
    public static void printNonASCIICharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Получаем текущий символ
            int unicode = (int) ch; // Получаем код символа в Юникоде

            // Проверяем, является ли символ не-ASCII (код > 127)
            if (unicode > 127) {
                System.out.println("Символ: " + ch + ", Юникод: U+" + Integer.toHexString(unicode).toUpperCase());
            }
        }
    }
}
