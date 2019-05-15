import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r,sum=0,temp,n;
        System.out.println("please insert your number: ");
        n = sc.nextInt();

        temp = n;

        while(n>0){

            r=n%10;

            sum=(sum*10)+r;
            n=n/10;}
            if(temp==sum)
                System.out.println("number inserted is a palindrome");
            else
                System.out.println("number inserted is not a palindrome");
        }

    }

