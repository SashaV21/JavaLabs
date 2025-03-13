package Lab1;

import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args){
        BigInteger fact = BigInteger.ONE;
        BigInteger limit = BigInteger.valueOf(1001);
        for (BigInteger i = BigInteger.ONE; i.compareTo(limit) != 0; i = i.add(BigInteger.ONE)){
           fact = fact.multiply(i);
        }
        System.out.println(fact);
    }
}
