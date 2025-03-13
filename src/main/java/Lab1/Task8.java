package Lab1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printAllSubstrings(input);

        scanner.close();
    }

    public static void printAllSubstrings(String str){
        int len = str.length();

        for (int i = 0; i < len; i++){
            for (int j = i + 1; j <= len; j++){
                String substring = str.substring(i, j);
                System.out.println(substring);
            }
        }
    }




}
