package main;

public class Main {
    public static void main(String[] args) {
        int a1, b1, c1;
        a1 = 10;
        b1 = -5;
        c1 = 20;

        float avg1;
        avg1 = (float)(a1 + b1 + c1) / 3;        // typecasting
        System.out.println("Average of a1, b1, c1 is: " + avg1);

        long a2,b2,c2;
        a2 = 102422;
        b2 = -52423;
        c2 = 20234;

        float avg2;
        avg2 = (float)(a2 + b2 + c2) / 3;
        System.out.println("Average of a2, b2, c2 is: " + avg2);


        boolean x;
        x = true;
        System.out.println("Value of x is: " + x);

        char y;
        y = '5';
        System.out.println("Value of y is: " + y);

        int m = 20, n = 4, o = 6;
        System.out.println("Sum of the values are " + (m + n + o));
    }
}