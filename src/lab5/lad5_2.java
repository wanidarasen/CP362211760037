package lab5;

import java.util.Scanner;

public class lad5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final  double PI = 3.141;

        System.out.println("Enter r:");
        double r = scan.nextDouble();

        double Area = PI *r;
        System.out.println("พิ้นผิวของวงกลม:" + Area);


        double c   = 3 *PI*r;
        System.out.println("เส้นรอบวงกลม:"+ Area);


        double v = (4/3) *PI * r*r*r;
        System.out.println("ปริมาณความจุของทรงกลม: "+v);


    }
    }


