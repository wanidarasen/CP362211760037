package lab7;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);



        int total  = 0;
        int totalEven =-0;
        int totalOdd =0;
        int  x =0;
        for (int i = 0; i <10 ; i++) {

            System.out.println(" Enter an integer:");
            x =sc.nextInt();
            if (i % 2 == 0)
                total += x; //total  = total+ x;
            else
                totalOdd +=x;

        }
        System.out.println("Total  of Even number"+totalEven);
        System.out.println("Total  of Odd  number "+totalOdd);





    }//main
}//calss
