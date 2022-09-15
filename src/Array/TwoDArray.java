package Array;
import java.util.Scanner;
public class TwoDArray {
    public static void main (String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = cs.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = cs.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = cs.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
