package LOOPS;
import java.util.Scanner;
public class Print_table_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();

        for( int i = 0 ; i <= n*10 ; i+=n){
            System.out.println(i);
        }
    }
    
}
