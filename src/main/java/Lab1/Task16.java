package Lab1;

public class Task16 {
    public static double average(double... values) {
        if (values.length == 0){
            return 0.0;
        }

        double result = 0;
        for (double value : values) {
            result += value;
        }
        return result / values.length;
    }

    public static void main(String[] args) {
        System.out.println(average());
    }
}
