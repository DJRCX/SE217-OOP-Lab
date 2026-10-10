package main;

public class Main {
    public static void main(String[] args) {
        int i;
        // for (i = 0; i < 10; i ++){
        //     System.out.println(i);
        // }
        // for (i = 50; i <= 100; i = i + 2){
        //     System.out.println(i);
        //     if (i == 60) {
        //         break;
        //     }
        //     if (i % 2 == 0) {
        //         continue;
        //     }
        // }
        // for (i = 100; i >= 0; i = i - 10){
        //     System.out.println(i);
        // }   
        int sum = 0 ;
        for (i = 30; i <= 120; i++){
            if (i % 3 == 0 && i % 5 ==0) {
                sum = sum + i;                
            }
        }
        System.out.println("Summation is: " + sum);
    }
}