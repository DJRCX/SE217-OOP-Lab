package main;

public class Main {
    public static void main(String[] args) {
        int x =3;
        while (x <= 5) {
            System.out.println("Let me go!");
            x++;
        }
        // infinite loop
        // while (true) {
        //     System.out.println("Hi");
        // }
        int y = 5, sum =0;
        while (y <= 100) {
            sum = sum + y;
            y = y + 5;
        }
        System.out.println("Sum is: " + sum);
    }
}