package main;

public class Main {
    public static void main(String[] args) {
        int myVar1;
        myVar1 = 500;
        myVar1 = myVar1 + 10;

        double myVar2;
        myVar2 = 500.5434;
        myVar2 = myVar2 + 10;
        System.out.println("Value of myVar is: " + myVar1);
        System.out.println("Value of myVar is: " + myVar2);

        int x = 10000;

        System.out.println("Stipend of Student-1: " + (3.33 * x));
        System.out.println("Stipend of Student-2: " + (3.23 * x));
        System.out.println("Stipend of Student-3: " + (3.37 * x));
        System.out.println("Stipend of Student-4: " + (3.93 * x));
    }
}