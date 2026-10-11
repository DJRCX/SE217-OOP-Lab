package main;

public class Main {
    public static void main(String[] args) {
        // char st[] = {'H', 'I'};

        String st = "Hi, I'm good.";
        String s3 = new String("Bangladesh");
        System.out.println(st + " " + s3);

        String s1 = "Dhaka, Bangladesh" ;
        String s2 = "Hi";
        int l = s1.length();
        System.out.println(l);
        System.out.println(s1.charAt(5));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        if (s1.equals(s2)) {
            System.out.println("They are equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
