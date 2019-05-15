import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu latimea dreptunghiului:");
        double l = sc.nextDouble();
        System.out.println("introdu Lungimea dreptunghiului");
        double L = sc.nextDouble();
        double area = l * L;
        double perimeter = 2 * (L + l);
        System.out.println("Aria dreptunghiului este: " + area);
        System.out.println("Perimetrul dreptunghiului este:" + perimeter);
Hexa();
    }

    public static void Hexa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu latura hexagonului: ");
        double a= sc.nextDouble();
        double areah = (3*Math.sqrt(3))/2*a*a;
        System.out.println("Aria hexagonului este:"+areah);
        double ph=6*a;
        System.out.println("Perimetrul hexagonului este:"+ph);


    }

    }
