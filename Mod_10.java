import java.util.Scanner;

public class Mod_10 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        char oldWord = scn.next().charAt(0);
        char newWord = scn.next().charAt(0);
        System.out.println(sentence.replace(oldWord , newWord));
    }
}
