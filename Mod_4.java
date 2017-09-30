import java.util.Scanner;

public class Mod_4 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int chinese = scn.nextInt();
        int english = scn.nextInt();
        int math = scn.nextInt();
        System.out.println((chinese + english + math) + "\n" + ((chinese + english + math)/3));
    }
}
