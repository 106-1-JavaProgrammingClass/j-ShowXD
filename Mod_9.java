import java.util.Scanner;

public class Mod_9 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float g = scn.nextInt();
        System.out.println(Math.round(g / 600 * 10)/10f);
    }
}
