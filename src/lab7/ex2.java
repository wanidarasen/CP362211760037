package lab7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyer your score,"+
                   "and I will  tell you goade ");

         int score = sc.nextInt();

         if (score >=0 && score <=50)   //0 -49
             System.out.println(" Grade  f.");
         else  if (score >=50 && score <=55)   //50-54
             System.out.println(" Grade  D.");
         else  if (score >=55 && score <=60)   //55-59
             System.out.println(" Grade  D+.");
         else  if (score>=60 && score <=65)   //60-64
             System.out.println(" Grade  C.");
         else  if (score >=65 && score <=70)   //65-69
             System.out.println(" Grade  C+");
         else  if (score >=70 && score <=75)   //70-74
             System.out.println(" Grade  B.");
         else  if (score >=75 && score <=80)   //75-79
             System.out.println(" Grade  B+.");
         else if (score >=80 && score <=100)  // 80-100
             System.out.println(" Grade  A.");
         else
             System.out.println(" กรุณากรอกคะแนนให้อยู่ในช่วงระหว่าง 0-100.");


    }
}
