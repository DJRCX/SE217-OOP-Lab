package main;

public class Main {
    public static void main(String[] args) {
        int x[][] = {{10, 11, 12},
                     {20, 21, 22}}; //new int [2][3];
        // x[1][1] = 10;
        // x[1][2] = 20;
        int y = x[1][1] + x[1][2];
        System.out.println(y);

        int sum =0;
        int a[][] = {{10, 20, 30},
                     {40, 50, 60}};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(a[i][j] + " ");
                sum = sum + a[i][j];
            }
        }
        System.out.println();
        System.out.println(sum/6);
    }
}
