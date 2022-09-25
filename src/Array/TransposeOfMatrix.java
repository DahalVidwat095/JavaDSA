package Array;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter your matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is: ");
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
