
import java.util.Scanner;

public class Second_largest_element {
    
    public static int Secondlargest(int array[]){
        int largest = array[0];
        int secondlargest = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>largest){
                largest = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondlargest && array[i] != largest ){
                secondlargest = array[i];
            } 
        }
        return secondlargest;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements of array ");
        int []arr = new int [size ];
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("second largest element is: "+Secondlargest(arr));

        sc.close();
    }
}
