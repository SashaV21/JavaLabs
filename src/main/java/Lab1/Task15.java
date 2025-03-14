package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите количество строк треугольника Паскаля (n): ");
        int n = scanner.nextInt();


        ArrayList<ArrayList<Integer>> triangle = generatePascalTriangle(n);


        System.out.println("Треугольник Паскаля для n = " + n + ":");
        printPascalTriangle(triangle);
    }


    public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            ArrayList<Integer> currentRow = new ArrayList<>();


            currentRow.add(1);


            if (row > 0) {
                ArrayList<Integer> previousRow = triangle.get(row - 1);
                for (int col = 1; col < previousRow.size(); col++) {
                    currentRow.add(previousRow.get(col - 1) + previousRow.get(col));
                }

                currentRow.add(1);
            }


            triangle.add(currentRow);
        }

        return triangle;
    }


    public static void printPascalTriangle(ArrayList<ArrayList<Integer>> triangle) {
        for (ArrayList<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
