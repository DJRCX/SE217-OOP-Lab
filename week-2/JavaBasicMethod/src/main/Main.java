package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start: ");
        sayHi();
        int result = getSum(100, 50);
        System.out.println("Result: " + result);
    }

    static int getSum (int x, int y){
        int sum = x + y;
        return sum;
    }

    static void sayHi (){
        System.out.println("Hi");
    }
}
