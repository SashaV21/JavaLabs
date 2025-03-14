package Lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();


        System.out.println("Двоичная форма: " + Integer.toBinaryString(number));
        System.out.println("Восьмеричная форма: " + Integer.toOctalString(number));
        System.out.println("Шестнадцатеричная форма: " + Integer.toHexString(number));


        double reciprocal = 1.0 / number;
        System.out.println("Обратное значение в шестнадцатеричной форме: " + Double.toHexString(reciprocal));


        scanner.close();
    }
}
