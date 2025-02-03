package upr;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        int numFlowers=Integer.parseInt(sc.nextLine());
        int budget=Integer.parseInt(sc.nextLine());
        double finalPrice=0.0;

        if(type.equals("Roses") && numFlowers>80)finalPrice=(5.0*numFlowers)-((5.0*numFlowers)*0.1);
        else if(type.equals("Roses") && numFlowers<=80)finalPrice=5.0*numFlowers;
        else if(type.equals("Dahlias") && numFlowers>90)finalPrice=(3.8*numFlowers)-((3.8*numFlowers)*0.15);
        else if(type.equals("Dahlias") && numFlowers<=90)finalPrice=(3.8*numFlowers);
        else if(type.equals("Tulips") && numFlowers>80)finalPrice=(2.8*numFlowers)-((2.8*numFlowers)*0.15);
        else if(type.equals("Tulips") && numFlowers<=80)finalPrice=(2.8*numFlowers);
        else if(type.equals("Narcissus") && numFlowers<120)finalPrice=(3.0*numFlowers)+((3.0*numFlowers)*0.15);
        else if(type.equals("Narcissus") && numFlowers>=120)finalPrice=(3.0*numFlowers);
        else if(type.equals("Gladiolus") && numFlowers<80)finalPrice=(2.5*numFlowers)+((2.5*numFlowers)*0.2);
        else if(type.equals("Gladiolus") && numFlowers>=80)finalPrice=(2.5*numFlowers);

        if(finalPrice<=budget)System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numFlowers,type,(double)budget-finalPrice);
   else System.out.printf("Not enough money, you need %.2f leva more.",finalPrice-budget);
    }
}
