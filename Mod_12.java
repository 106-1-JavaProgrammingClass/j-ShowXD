import java.util.Scanner;

public class Mod_12 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        double number1 = scn.nextDouble();
        int n = scn.nextInt();
        System.out.println(Math.round(number1 * Math.pow(10 , n))/Math.pow(10 , n));
    }
}
