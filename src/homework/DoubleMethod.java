package homework;

public class DoubleMethod {

    public static double formatDouble(double number, int d) {
        int num = (int) Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);
        return number;
    }
}
