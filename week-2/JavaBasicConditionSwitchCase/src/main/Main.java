package main;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("Bangladesh");
                break;
            case 2:
                System.out.println("USA");
                break;
            default:
                System.out.println("Out of the Earth");
                break;
        }
        int y = 'a';
        switch (y) {
            case 'a':
                System.out.println("Bangladesh");
                break;
            case 'b':
                System.out.println("USA");
                break;
            default:
                System.out.println("Out of the Earth");
                break;
        }
    }
}