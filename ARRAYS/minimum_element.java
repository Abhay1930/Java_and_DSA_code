package ARRAYS;

import java.util.Scanner;

public class minimum_element {

    public static int minimum(int array[]){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]< min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the elemrnt of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the minimum element is :"+ minimum(arr));
    }

}
