package PATTERNS;

import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % 2 != 0){
                    System.out.print(j+ " ");
                }
                else
                System.out.print((char)(j+64)+" ");
            }
            System.out.println( );
        }
    }
}

// output
// 1
// A B
// 1 2 3
// A B C D
// 1 2 3 4 5