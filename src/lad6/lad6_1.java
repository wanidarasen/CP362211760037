package lad6;
import java.util.Scanner;
public class lad6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.println("Input a  degree in Celsius:");
        c = sc.nextDouble();
        double f= (9*c+(32*5))/5;

        System.out.println(c+ "degree Celsies is equal to "+f+" in Fahrenh");

    }
}
