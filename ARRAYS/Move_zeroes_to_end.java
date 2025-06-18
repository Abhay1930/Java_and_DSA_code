package ARRAYS;
import  java.util.Scanner;

public class Move_zeroes_to_end {
    public static void moving_zeroes(int array[]){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                array[j] = array[i]; 
                j++;
            }
        }
        while (j < array.length ) { 
            array[j]= 0;
            j++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
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
        moving_zeroes(arr);
        sc.close();
    }

}
