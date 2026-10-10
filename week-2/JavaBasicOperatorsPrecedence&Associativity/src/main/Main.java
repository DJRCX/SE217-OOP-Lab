package main;

public class Main {
    public static void main(String[] args) {
        int x;
        x = 7 + 5;
        x -= 10;
        x++;
        System.out.println("Value of x is: " + x);


        int y;
        
        y = 5;
        System.out.println("Current value of y is: " + y++); //result 5, then incremented
        System.out.println("Current value of y is: " + ++y); //incremented, result 7

        y =5;
        System.out.println("Current value of y is: " + ++y); //incremented, reesult 6
        System.out.println("Current value of y is: " + y++); // result 6, incremented

        int z = 10 + 2 * 4 - 3;
        System.out.println(z);
    }
}