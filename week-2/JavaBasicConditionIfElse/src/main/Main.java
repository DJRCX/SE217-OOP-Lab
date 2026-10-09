package main;

public class Main {
    public static void main(String[] args) {
        int x = 20;
        if (x > 400) {
            System.out.println("Hi "); // Doesn't print.
        }
        if (x % 2 == 0 && x % 5 == 0) {
            System.out.println("Bye ");
        }
        int y = 22;
        if (y % 2 == 0 || y % 5 == 0) {
            System.out.println("Aye ");
        }

        int a = 2;
        if (a > 5 && a < 10) {
            System.out.println("6 - 10");
        }else{
            System.out.println("Condition false. ");
        }

        int num = 45;
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }

        char g = 'a';
        if (g == 'a' || g == 'e' || g == 'i' || g == 'o' || g == 'u') {
            System.out.println("The alphabet is Vowel");
        }else{
            System.out.println("The alphabet is Consonant");
        }
    }
}