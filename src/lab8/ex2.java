package lab8;

import javax.swing.text.Style;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input data to array
        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter an integer[" + (i + 1) + "]:");
            num[i] = sc.nextInt();

        }//for

        //show data in array
        System.out.println("data in array");
        for (int i : num) {
            System.out.print(i + " ");
        }
        //find maximun
        int max = num [0];
        for (int i:num){
            if (max <=i)
                max =i;
        }
        System.out.println("The maximum number:  "+max);
        //find maximun
        int mini = num [0];
        for (int i:num){
            if ( mini>=i)
                mini =i;
        }
        System.out.println("The maximum number:  "+mini);


        //find average
        int total = 0;
        for (int i:num) {
            total += i;
        }
        System.out.println("The average number: "+(total/num.length));

        }
    }

