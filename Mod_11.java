import java.util.Scanner;

public class Mod_11 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();
        System.out.println(Math.max(Math.max(number1 , number2) , number3) + "\n" + Math.min(Math.min(number1 , number2) , number3));
    }
}
