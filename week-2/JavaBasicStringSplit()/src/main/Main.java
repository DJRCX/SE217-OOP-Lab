package main;

public class Main {
    public static void main(String[] args) {
        String s = "I love bangladesh";
        String s1 = "I                        love                             bangladesh";

        String [] a = s.split("\\s"); //or (" "). \s is equal to " "(space).
        String [] a1 = s1.split("\\s+");  // when there is way more spaces

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }
    }
}
