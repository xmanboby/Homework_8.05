import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("intruceti latitudinea primului punct:");

        double lat1 = sc.nextDouble();

        System.out.println("intruceti longitudinea primului punct:");

        double long1 = sc.nextDouble();

        System.out.println("intruceti latitudinea punctului doi:");

        double lat2 = sc.nextDouble();

        System.out.println("intruceti longitudinea punctului doi:");

        double long2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(lat2 -lat1,2)+Math.pow(long2-long1,2));

        System.out.println("distanta dintre cele doua puncte este :" +distance);









    }
}
