package main;

public class Main {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i<= 2; i++){
            System.out.println("Outer loop start");
            for (j = 1; j <= 3; j++){
                System.out.println("Inner loop start");
                System.out.println("Inner loop end");
            }
            System.out.println("Outer loop end");
        }
        for (i =1; i <= 2; i++){
            for (j = 1; j <= 3; j++){
                for (k = 1; k <= 2; k ++){
                    System.out.println("Hi");
                }
            }
        }
        for (i = 1; i <= 5; i++){
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }System.out.println();
        }
        for (i = 1; i <= 5; i++){
            for (j = 5; j >= i; j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}