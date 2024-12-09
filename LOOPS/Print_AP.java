package LOOPS;
import java.util.Scanner;
public class Print_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n th term:");
        int n = sc.nextInt();
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of d:");
        int d = sc.nextInt();
        for( int i = a ; i <= a +(n-1)*d ; i += d){
                System.out.print(i + " ");
            }
            
        }
    
}


  // formula for calculating nth term  = a + ( n - 1 ) * d

   
    
