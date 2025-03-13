package Lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя целочисленное значение
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Выводим число в двоичной, восьмеричной и шестнадцатеричной форме
        System.out.println("Двоичная форма: " + Integer.toBinaryString(number));
        System.out.println("Восьмеричная форма: " + Integer.toOctalString(number));
        System.out.println("Шестнадцатеричная форма: " + Integer.toHexString(number));

        // Вычисляем обратное значение и выводим его в шестнадцатеричной форме с плавающей точкой
        double reciprocal = 1.0 / number;
        System.out.println("Обратное значение в шестнадцатеричной форме: " + Double.toHexString(reciprocal));

        // Закрываем Scanner
        scanner.close();
    }
}
