package lad6.MidtemExams;

import java.util.Scanner;

public class Exams2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final  double PI = 3.141;

        System.out.println("กรุณากรอกตัวเลขของรัศมี:");
        double r = scan.nextDouble();

        double Area = PI *r;
        System.out.println("พิ้นที่ฐานทรงกระบอก:" + Area);


        double h   = 2 *PI*r;
        System.out.println("ความสูง:"+ Area);


        double v = (4/3) *PI * r*r*r*h;
        System.out.println("ปริมาณของทรงกระบอก: "+v);


    }

}
