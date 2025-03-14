package Lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите строку: ");
        String input = scanner.nextLine();


        System.out.println("Символы, не представленные в ASCII:");
        printNonASCIICharacters(input);


        scanner.close();
    }


    public static void printNonASCIICharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int unicode = (int) ch;


            if (unicode > 127) {
                System.out.println("Символ: " + ch + ", Юникод: U+" + Integer.toHexString(unicode).toUpperCase());
            }
        }
    }
}
