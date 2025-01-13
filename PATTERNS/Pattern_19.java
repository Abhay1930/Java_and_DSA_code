package PATTERNS;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                if (i+j <= n) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }System.err.println();
            
        }
    }
}

// output
//    *
//   **
//  ***
// ****