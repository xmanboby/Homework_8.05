import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wan to convert");
        String str= sc.nextLine();

        System.out.println("Converted string is :" + str.toLowerCase());
    }
}
