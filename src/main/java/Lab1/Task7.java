package Lab1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел в пределах от 0 до 65535
        System.out.print("Введите первое число (0-65535): ");
        int input1 = scanner.nextInt();
        System.out.print("Введите второе число (0-65535): ");
        int input2 = scanner.nextInt();

        // Проверка на корректность ввода
        if (input1 < 0 || input1 > 65535 || input2 < 0 || input2 > 65535) {
            System.out.println("Ошибка: числа должны быть в пределах от 0 до 65535.");
            return;
        }

        // Сохранение чисел в переменных типа short
        short num1 = (short) input1;
        short num2 = (short) input2;

        // Вычисление суммы, разности, произведения, частного и остатка без знака
        int sum = (num1 & 0xFFFF) + (num2 & 0xFFFF);
        int difference = (num1 & 0xFFFF) - (num2 & 0xFFFF);
        int product = (num1 & 0xFFFF) * (num2 & 0xFFFF);
        int quotient = (num1 & 0xFFFF) / (num2 & 0xFFFF);
        int remainder = (num1 & 0xFFFF) % (num2 & 0xFFFF);

        // Вывод результатов
        System.out.println("Сумма (без знака): " + (sum & 0xFFFF));
        System.out.println("Разность (без знака): " + (difference & 0xFFFF));
        System.out.println("Произведение (без знака): " + (product & 0xFFFF));
        System.out.println("Частное (без знака): " + (quotient & 0xFFFF));
        System.out.println("Остаток (без знака): " + (remainder & 0xFFFF));
    }
}
