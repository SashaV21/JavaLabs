package Lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> rows = new ArrayList<>();

        System.out.println("Введите строки чисел (пустая строка для завершения):");


        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }


            String[] parts = line.split(" ");
            int[] row = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                row[i] = Integer.parseInt(parts[i]);
            }

            rows.add(row);
        }


        int size = rows.size();
        int[][] square = new int[size][];
        for (int i = 0; i < size; i++) {
            square[i] = rows.get(i);
        }


        if (isMagicSquare(square)) {
            System.out.println("Это магический квадрат!");
        } else {
            System.out.println("Это не магический квадрат.");
        }
    }


    public static boolean isMagicSquare(int[][] square) {
        int size = square.length;


        for (int[] row : square) {
            if (row.length != size) {
                return false;
            }
        }


        int magicSum = 0;
        for (int num : square[0]) {
            magicSum += num;
        }


        for (int[] row : square) {
            int rowSum = 0;
            for (int num : row) {
                rowSum += num;
            }
            if (rowSum != magicSum) {
                return false;
            }
        }


        for (int col = 0; col < size; col++) {
            int colSum = 0;
            for (int row = 0; row < size; row++) {
                colSum += square[row][col];
            }
            if (colSum != magicSum) {
                return false;
            }
        }


        int diagSum1 = 0;
        for (int i = 0; i < size; i++) {
            diagSum1 += square[i][i];
        }
        if (diagSum1 != magicSum) {
            return false;
        }


        int diagSum2 = 0;
        for (int i = 0; i < size; i++) {
            diagSum2 += square[i][size - 1 - i];
        }
        if (diagSum2 != magicSum) {
            return false;
        }


        return true;
    }
}