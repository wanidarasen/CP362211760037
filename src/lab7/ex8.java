package lab7;

import com.sun.deploy.util.SyncAccess;

public class ex8 {
    public static void main(String[] args) {

        for (int i = 8; i >=1 ; i--) {
            for (int j = 8; j >=i ; j--) {
                System.out.print("*");
            }//for j
            System.out.println();

        }//for i
        System.out.println("\n\n");

        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*");
            }//for j
            System.out.println();

        }//for i
        int count = 1;

        System.out.println("\n\n");

        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+"  ");
                count++;
            }//for j
            System.out.println();

        }//for i








    }
}
