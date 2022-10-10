package Strings;

public class PrintEveryCharacter {
    public static void main (String args[]){
        String firstName = "Vidwat";
        String lastName = "Dahal";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        for (int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i)+" ");
        }
    }
}
