package LOOPS;
import java.util.Scanner;

public interface Count_digit_of_any_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ; 
        if (n==0) count++;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }  
}
