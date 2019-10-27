package Quiz;
import javafx.scene.shape.Circle;

import java.util.Scanner;

public class jipata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Continue (Y/N):");
        char c = sc.next().charAt(0);
        if (c == 'Y' || c == 'Y') showOption();
        else {
            System.out.println("Good Bay.");
            System.exit("1"); }

    }
     public static void main(String [] args) {
         showOption();
         }

     public static void showOption() {
         Scanner sc = new Scanner(System.in);
         int select;
         do {
             System.out.print("#### Welcome to Jipata System####: ");
             System.out.print("Please, select Option below : ");
             System.out.print("1. BOdy Mass Index(BMI)");
             System.out.print("2. Geometry Capacity");
             System.out.print("3. Working with Array");
             System.out.print("4. Exit");
             System.out.print("Select: ");
             select = sc.nextInt();
             switch (select) {
                 case 1:
                     BMI();
                     break;
                 case 2:
                     GenometryCapasity();
                     break;
                 case 3:
                     System.out.println("3.");
                     break;
                 case 4:
                     System.exit(1);
                     break;
                 default:
                     System.out.println("Please, select 1-4.");
             }
         } while (select < 1 || select > 4);

     }

     private static void GenometryCapasity () {
         Scanner sc = new Scanner(System.in);
         System.out.println("\t1. Cicle");
         System.out.println("\t2. Pyramid");
         System.out.println("\tSelect:");
         int select = sc.nextInt();
         if (select == 1)
             Circle();
         else Pyramid();
     }

     private static  void Pyramid (){
         Scanner in = new Scanner(System.in);
         System.out.print("Enter Weight  : ");








        //BMT= weight/(height*height)

        Scanner in = new Scanner(System.in);

        System.out.print("Weight: ");
        float weight = in.nextFloat();

        System.out.print("Height: ");
        float height = in.nextFloat();

        float bmi = weight*10000.00f/(height*height);
        System.out.print(bmi);

        in.close();

    }
}
