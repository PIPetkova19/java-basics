package lekciq;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double avg=0.0d;
        int countBad=0;
        for(int i=1;i<=12;i++){
            double grade=Double.parseDouble(sc.nextLine());
            avg+=grade;
            if(grade<4)countBad++;
            if(countBad>1){System.out.printf("%s has been excluded at %d grade",name,i-1);return;}
        }
        System.out.printf("%s graduated. Average grade: %.2f",name,avg/12);
    }
}
