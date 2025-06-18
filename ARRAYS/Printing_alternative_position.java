package ARRAYS;

import java.util.Scanner;

public class Printing_alternative_position {
    public static void alternate(int arr[]){
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(array[i]);
        }
        
        

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the element of array one by one ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();     
        }
       alternate(arr);
       sc.close();
    }
}
