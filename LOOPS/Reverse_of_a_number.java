package LOOPS;
import java.util.*;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n!=0){
            int lastDigit = n % 10;
            rev *= 10;
            rev += lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
    
}
