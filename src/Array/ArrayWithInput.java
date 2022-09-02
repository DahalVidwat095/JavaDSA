package Array;

import java.util.Scanner;

public class ArrayWithInput {
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter size of array (n): ");
        int n = cs.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Insert the value for array: ");
            numbers[i] = cs.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
