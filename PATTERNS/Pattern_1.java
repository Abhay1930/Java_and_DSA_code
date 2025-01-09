package PATTERNS;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows & Column");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
