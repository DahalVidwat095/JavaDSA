package Functions;

import java.util.Scanner;

public class CircumferenceOfCircle {
    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumference(double radius){
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        return circumference;
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter value of radius (in cm): ");
        double radius = cs.nextDouble();
        System.out.print("The circumference of the circle having given radius is " + circumference(radius) + " cm.");
    }
}
