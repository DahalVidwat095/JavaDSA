package Array;

import java.util.Scanner;

public class IndexOfArray {
    //Take an array as input from the user. Search for a
    //given number x and print the index at which it occurs.
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = cs.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Value for array: ");
            numbers[i] = cs.nextInt();
        }
        System.out.print("Enter value of x: ");
        int x = cs.nextInt();
        for(int i=0; i<size; i++){
            if(x == numbers[i]){
                System.out.print("Your required number "+ x +" is at "+ i + " index." );
            }else {
                continue;
            }
        }
    }
}
