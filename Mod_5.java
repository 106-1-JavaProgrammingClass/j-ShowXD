import java.util.Scanner;

public class Mod_5 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        int weight = scn.nextInt();
        System.out.println(height / 2.54d + "\n" + weight / 0.454d);
    }
}
