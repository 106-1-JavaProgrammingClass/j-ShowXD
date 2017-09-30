import java.util.Scanner;

public class Mod_6 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.next();
        char mark = scn.next().charAt(0);
        System.out.println(sentence.replace(mark , '\n'));
    }
}
