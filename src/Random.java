import java.util.Scanner;

public class Random {
    //Write a program to enter the numbers till the user wants and at the end
    // it should display the count of positive, negative and zeros entered.
    public static void main(String args[]) {
        Scanner cs = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int zero = 0;
        char choice = 'y';
        do {
            System.out.print("Enter your number: ");
            int number = cs.nextInt();
            if (number < 0) {
                negative++;
            } else if (number > 0) {
                positive++;
            } else {
                zero++;
            }
            System.out.print("Do you want to continue?(y/n): ");
            choice = cs.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        {
            System.out.println("positive: "+positive);
            System.out.println("negative: "+ negative);
            System.out.println("zero: "+ zero);
        }
    }
}

