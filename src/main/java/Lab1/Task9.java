package Lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        if (s1.compareTo(s2) == 0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
