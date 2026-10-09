package main;

public class Main {
    public static void main(String[] args) {
        // println puts the new line automatically in the next line
        System.out.println("Bangladesh");
        System.out.println("Dhaka");
        System.out.println("Saidpur");
        // without it the lines will be in a single line without any spaces
        System.out.print("Bangladesh");
        System.out.print("Dhaka");
        System.out.print("Saidpur");
        // adding "\t adds a space after the words"
        System.out.print("Bangladesh\t");
        System.out.print("Dhaka\t");
        System.out.print("Saidpur\t");
        // adding "\n works the same as println"
        System.out.print("Bangladesh\n");
        System.out.print("Dhaka\n");
        System.out.print("Saidpur\n");

        System.out.print("Hi\n\n\nHello");
    }
}
