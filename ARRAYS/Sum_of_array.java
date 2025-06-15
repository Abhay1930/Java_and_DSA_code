
import java.util.*;

public class Sum_of_array {

    public static int sum(int array[]){
        int sum = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        
        int []arr = new int[size];
        System.out.println("enter the element of array ");
        for (int i = 0; i < size; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("sum of array"+ sum(arr));
        sc.close();
    }
}
