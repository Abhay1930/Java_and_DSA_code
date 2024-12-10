package LOOPS;
import java.util.Scanner;
public class Print_all_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        for( int i = 0 ; i <= n ; i++){
            if( i % 2 == 0 ){
                System.out.println(i);
            }
            
        }
    }
    
}


   
    
