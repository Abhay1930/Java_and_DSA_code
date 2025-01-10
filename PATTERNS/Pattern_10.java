package PATTERNS;

import java.util.Scanner;

public class Pattern_10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// output
// 1 1 1 1 1
// 2 2 2 2
// 3 3 3
// 4 4
// 5