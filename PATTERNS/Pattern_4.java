package PATTERNS;
import java.util.Scanner;

// number square 2

public class Pattern_4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column");
        int n = sc.nextInt();
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
     }
}
