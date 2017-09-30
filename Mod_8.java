import java.util.Scanner;

public class Mod_8 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        System.out.println(Math.round(l*0.26418*10)/10f);
    }
}
