package Lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение угла в градусах: ");
        int angle = scanner.nextInt();

        int normalizeAngleMod = normalizeUsingMod(angle);
        System.out.println("Нормализованный угол с помощью %: " + normalizeAngleMod);

        int normalizeAngleFunc = normalizeUsingFunc(angle);
        System.out.println("Нормализованный угол с помощью floorMod(): " + normalizeAngleFunc);

        scanner.close();
    }

    public static int normalizeUsingMod(int angle){
        return (angle % 360 + 360) % 360;
    }

    public static int normalizeUsingFunc(int angle){
        return Math.floorMod(angle, 360);
    }
}
