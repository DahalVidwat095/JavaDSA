package Functions;

import java.util.Scanner;

public class PositiveNegativeZero {
    /*Write a program to enter the numbers till the user wants and at the end it should display the count
     of positive, negative and zeros entered.*/
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        char choice='y';
        do{
            System.out.print("Enter your number: ");
            int number= cs.nextInt();

            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zero++;
            }
            System.out.print("Do you want to continue?(y/n): ");
            choice = cs.next().charAt(0);
        }while(choice=='y' || choice=='Y');{
            System.out.println("Positive: "+positive);
            System.out.println("Negative: "+negative);
            System.out.println("Zero: "+zero);
        }
    }
}




