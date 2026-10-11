package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x;
        // // long x;
        // // double x;
        // System.out.print("Enter the value of x: ");
        // x = sc.nextInt();
        // // x = sc.nextLong();
        // // x = sc.nextDouble();
        // System.out.println("x = " + x);
        
        //String s = sc.next();Scans only one token.
        String s = sc.nextLine(); //scans the whole line.
        System.out.println("You entered: " + s);
        
        sc.close();
    }
}
