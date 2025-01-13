package PATTERNS;

import java.util.Scanner;

// number Square

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column");
        int n = sc.nextInt();
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
