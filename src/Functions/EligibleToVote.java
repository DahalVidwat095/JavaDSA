package Functions;

import java.util.Scanner;

public class EligibleToVote {
    //Write a function that takes in age as input and returns if that person is eligible to vote or not.
    // A person of age > 18 is eligible to vote.
    public static boolean isEligible(int age){
        if(age<18){
            return false;
        } else {
            return true;
        }
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = cs.nextInt();
        if(isEligible(age)){
            System.out.print("The person is eligible for voting.");
        }else{
            System.out.print("The person is not eligible for voting.");
        }
    }
}
