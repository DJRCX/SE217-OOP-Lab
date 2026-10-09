package main;

public class Main {
    public static void main(String[] args) {
        int x = 22;
        if (x == 1) {
            System.out.println("Hi");
        }else if (x == 2) {
            System.out.println("Hello");
        }else if (x == 3) {
            System.out.println("Goodbye");
        }else {
            System.out.println("Wrong input");
        }


        int age = 23;
        if (age < 2) {
            System.out.println("Status: Infant");
        }else if (age < 10) {
            System.out.println("Status: Child");
        }else if (age < 20) {
            System.out.println("Status: Teenage");
        }else if (age < 30) {
            System.out.println("Status: Adult");
        }else {
            System.out.println("Status: Old");
        }
    }
}