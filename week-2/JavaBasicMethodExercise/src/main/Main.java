package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        myFunc();
        evenodd(34);
        divisors(8);
        System.out.println("Please enter the value of a & b: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        int r = add(a, b);
        int s = sub(a, b);
        int t = mul(a, b);
        double u = div(a, b);
        System.out.println("Add Output: " + r);
        System.out.println("Sub Output: " + s);
        System.out.println("Mul Output: " + t);
        System.out.println("Div Output: " + u);
    }

    static void myFunc(){
        System.out.println("Hello, I'm from inside of a function");
    }

    static void evenodd(int x){
        if (x % 2 ==0) {
            System.out.println("Even.");
        }else System.out.println("Odd");
    }

    static void divisors(int y){
        for(int i = 1; i <= y; i++){
            if (y % i == 0) {
                System.out.println(i);
            }
        }
    }

    static int add(int a, int b){
        int result = a + b;
        return result;
    }
    static int sub(int a, int b){
        int result = a - b;
        return result;
    }
    static int mul(int a, int b){
        int result = a * b;
        return result;
    }
    static double div(int a, int b){
        double result = a / b;
        return result;
    }
}
