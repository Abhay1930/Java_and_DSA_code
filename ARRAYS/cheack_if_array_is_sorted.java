
import java.util.Scanner;

public class cheack_if_array_is_sorted {

    public static boolean sorted(int array[]){
        boolean issorted = true;
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] > array[i+1]){
                issorted = false;
                break;
            }
           
        }
        return issorted;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        
        System.out.println("the is sorted "+sorted(arr));

    }
}
