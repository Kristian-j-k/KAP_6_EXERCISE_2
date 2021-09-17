package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(squareRoot(9));
    }
    // regner kvadratroden, men lidt forkert
    static double squareRoot (double q) {

            double a = q;
            double x0 = 6;
            double x1 = (x0 + a / x0) / 2;

            double x4 = 100;
            while (x1  < x4) {
                x4 = x1;
            //   System.out.print(" x4 " + x4 + ";");
                x0 = x0 - 0.01;
                x1 = (x0 + a / x0) / 2;

            //    System.out.println(" x1 = " + x1);
            //    System.out.println(" x4 = "+x4);
            }
        return x4;
        }




}
