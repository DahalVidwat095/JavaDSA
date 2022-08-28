package Functions;
import java.util.Scanner;

public class PrimeOrNot {
    //Make a function to check if a number is prime or not.

    static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2; i<=number/2; i++){
            if((number%i)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = cs.nextInt();
        if(isPrime(number)){
            System.out.print(number+ " is a Prime number.");
        }else{
            System.out.print(number+ " is not a Prime number.");
        }
    }
}


