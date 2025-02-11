package upr;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int badGradesLimit=Integer.parseInt(sc.nextLine());
        int badGradesCount=0, sumGrades=0, count=0;
        String str=sc.nextLine(),name="";

        while(!str.equals("Enough")){
            name=str;
            int grade=Integer.parseInt(sc.nextLine());
            sumGrades+=grade;
            count++;
            if(grade<=4)badGradesCount++;
            if(badGradesCount>=badGradesLimit){ System.out.printf("You need a break, %d poor grades.",badGradesCount);break;}

            str=sc.nextLine();
        }
        if(badGradesCount<badGradesLimit){
            System.out.printf("Average score: %.2f%n",(float)sumGrades/count);
            System.out.printf("Number of problems: %d%n",count);
            System.out.printf("Last problem: %s%n",name);
        }
    }
}
