import java.util.Scanner;

public class Occurance_of_target_element {

    public static int occurance(int array[], int target){
        int count = 0 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.err.println("enter the target value");
        int target = sc.nextInt();
        System.err.println("enter the element of array one by one ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();     
        }
       System.out.println(occurance(arr, target));
    }
}
