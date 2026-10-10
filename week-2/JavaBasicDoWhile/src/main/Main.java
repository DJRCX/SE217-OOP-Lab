//used when a task is needed to be run even for once, even if it doesn't meet the conditions

package main;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Let me go!");
            i ++;
        }while (i <= 5);
        do {
            System.out.println(i);
            i = i + 5;
        }while (i <= 100);

        int x = -30;
        do {
            System.out.println("Hi");
        }while (x >= -25);
    }
}