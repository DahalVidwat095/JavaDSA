package Array;

import java.util.Scanner;

public class IndexOfTwoDArray {
    //Qs.Take a matrix as input from the user. Search for a
    //given number x and print the indices at which it occurs.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Select your desired number: ");
        int num = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == num) {
                    System.out.print("The number is found at (" + i + "," + j + ") position."  );
                }else{
                    continue;
                }
            }
        }
    }
}
