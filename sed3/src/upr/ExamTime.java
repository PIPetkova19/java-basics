package upr;

import java.util.Scanner;

public class ExamTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int examHour=Integer.parseInt(sc.nextLine());
        int examMinutes=Integer.parseInt(sc.nextLine());
        int arrivalHour=Integer.parseInt(sc.nextLine());
        int arrivalMin=Integer.parseInt(sc.nextLine());

        int examTime=examHour*60+examMinutes;
        int arrivalTime=arrivalHour*60+arrivalMin;

       if(arrivalTime>examTime){
           System.out.println("Late");
           if(arrivalTime-examTime<60) System.out.printf("%d minutes after the start",arrivalTime-examTime);
       else{
               if(arrivalMin-examMinutes<10)System.out.printf("%d:0%d hours after the start",arrivalHour-examHour,arrivalMin-examMinutes);
               else System.out.printf("%d:%d hours after the start",arrivalHour-examHour,arrivalMin-examMinutes);

           }
       }
       else if(examTime-arrivalTime>30){
           System.out.println("Early");
           if(examTime-arrivalTime<60) System.out.printf("%d minutes before the start",examTime-arrivalTime);
           else {
               if(examMinutes-arrivalMin<10)System.out.printf("%d:0%d hours before the start",examHour-arrivalHour,examMinutes-arrivalMin);
               else System.out.printf("%d:%d hours before the start",examHour-arrivalHour,examMinutes-arrivalMin);
           }

       }
       else {
           System.out.println("On time");
           if(arrivalTime!=examTime) System.out.printf("%d minutes before the start",examTime-arrivalTime);
       }
    }
}
