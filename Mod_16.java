import java.util.Scanner;

public class Mod_16 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float height = scn.nextFloat();
        System.out.println((double)r * r * Math.PI * height);
    }
}
