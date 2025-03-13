package Lab1;

import java.util.*;

public class Task13 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 49; i++){
            numbers.add(i);
        }
        List<Integer> lotterey = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++){
            int index = random.nextInt(numbers.size());
            lotterey.add(numbers.get(index));
            numbers.remove(index);
        }

        Collections.sort(lotterey);
        System.out.println("Combination:");
        for (int num : lotterey){
            System.out.print(num + " ");
        }

    }
}
