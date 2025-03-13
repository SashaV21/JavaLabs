package Lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int max = first;
        if (max < second){
            max = second;
        }
        if (max < third){
            max = third;
        }
        System.out.println("Максимальное значение найденное с помощью условного оператора: " + max);
        max = 0;
        max = Math.max(Math.max(first, second), third);
        System.out.println("Максимальное значение с помощью Math.max(): " + max);

        scanner.close();
    }
}
