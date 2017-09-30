import java.util.Scanner;

public class Mod_15 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String ascii = scn.next();
        int v3 = Integer.valueOf(ascii , 16);
        System.out.println((char)v3);
    }
}
