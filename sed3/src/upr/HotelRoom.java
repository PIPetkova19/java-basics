package upr;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String month=sc.nextLine();
        int numStay=Integer.parseInt(sc.nextLine());
        double studioPrice=0.0;
        double aptPrice=0.0;
        switch (month){
            case "May","October"->{
                studioPrice=50.0*numStay;
                aptPrice=65.0*numStay;
            }
            case "June","September"-> {
                studioPrice = 75.20*numStay;
                aptPrice = 68.70*numStay;
            }
            case "July","August"->{
                studioPrice=76.0*numStay;
                aptPrice=77.0*numStay;
            }
        }
        if(numStay>14)
            aptPrice=aptPrice-aptPrice*0.1;

        if(numStay>14 && (month.equals("May") || month.equals("October")))
            studioPrice=studioPrice-studioPrice*0.3;
       else  if(numStay>7 && (month.equals("May") || month.equals("October")))
            studioPrice=studioPrice-studioPrice*0.05;
       else  if(numStay>14 && (month.equals("June") || month.equals("September")))
            studioPrice=studioPrice-studioPrice*0.2;


       System.out.printf("Apartment: %.2f lv.",aptPrice);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",studioPrice);

    }
}
