import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        System.out.println("Introduceti sirul de caractere:");

        Scanner read = new Scanner(System.in);

        String original, inversul= "";

        original =read.nextLine();

        int lungimea = original.length();

        for (int i = lungimea - 1; i >=0; i--)

            inversul= inversul + original.charAt(i);

        System.out.println("inversul originalului este:"+inversul);



    }
}
