package ARRAYS;

import java.util.Scanner;

public class Count_even_odd {
    public static void counting (int array[]){
        int even = 0 ;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 ){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println(even+" "+odd);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter the element of array :");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        counting(arr);
       
        
    }
}
