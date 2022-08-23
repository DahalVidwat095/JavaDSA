package patterns;

public class Xmas {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i || i==9){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 4 || j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
