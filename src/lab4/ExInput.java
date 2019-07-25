package lab4;

import  java.util.Scanner;
public class ExInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please,enter an integer:");
        int x = scanner.nextInt();
        System.out.println("Your entered integer:"+x);

        System.out.println("Please,enter nan integer2:");
        Double b = scanner.nextDouble();
        System.out.println("Your entered integer+b:");

        //input Stsing
        System.out.println("Please,enter you name:");
        String s = scanner.nextLine();

        System.out.println( "You name is:"+s);



    }
}
