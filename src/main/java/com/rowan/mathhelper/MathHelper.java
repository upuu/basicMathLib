package com.rowan.mathhelper;

public class MathHelper {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public static double average(double[] numbers) {
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (double num : numbers) sum += num;
        return sum / numbers.length;
    }
}
