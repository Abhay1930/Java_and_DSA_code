package ARRAYS;
import java.util.Scanner;

public class Reverse_an_array {

    public static void reverse(int array[]){
        for(int i = 0 ; i< array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length -i-1];
            array[array.length -i-1] = temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int []arr = new int [size];
        System.out.println("enter the value of array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        for(int value :arr){
            System.out.print(value + " ");
        }
    }Sc.close();
}
