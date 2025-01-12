package PATTERNS;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                if(i % 2 != 0){
                    System.out.print((char)(i+64)+" ");
                }else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}

// output
// A A A A A
// 2 2 2 2
// C C C
// 4 4
// E
