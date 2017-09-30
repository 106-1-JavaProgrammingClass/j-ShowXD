import java.util.Scanner;

public class Mod_1 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int mile = scn.nextInt();
        System.out.println(Math.round(mile*1.6*10)/10d);
    }
}
