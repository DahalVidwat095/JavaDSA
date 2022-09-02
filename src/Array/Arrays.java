package Array;

public class Arrays {
    public static void main(String args[]){
        int number = 10;
        int[] array = new int[10];
        for(int i=0; i<10; i++){
            array[i] = number;
            number++;
            System.out.print(array[i]+" ");
        }
    }
}
