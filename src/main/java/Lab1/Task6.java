package Lab1;

import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args){
        BigInteger fact = BigInteger.ONE;
        for (int i = 0; i <= 1000; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
    }
}
// оптимизировать цикл