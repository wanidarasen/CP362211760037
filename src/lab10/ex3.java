package lab10;

import java.util.Scanner;



public class ex3 {
    private static final  int MAX=5;
    public static void main(String[] args) {

        //input  data to array
        Scanner sc =new Scanner(System.in);
        int num[] =new int[MAX];

        for (int i = 0; i <num.length ; i++) {
            System.out.println("enter an integer: ");
            num[i] =  sc.nextInt();

        }
        //find total value in array
        findAverage(num);



    }//main

    private static void findAverage(int[] num) {
        int totol = 0;
        for (int val:num){
            totol +=val;
        }

        System.out.println("Total value:" + totol);
        System.out.println("Average value:" + (totol/num.length));

    }



}//ciass
