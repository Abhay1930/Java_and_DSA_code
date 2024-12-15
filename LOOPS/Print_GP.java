package LOOPS; 
import java.util.Scanner;
public class Print_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n th term:");
        int n = sc.nextInt();
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of r:");
        int r = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println(a+" ");
            a *= r;
            
        }
    }
}
