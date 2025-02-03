package upr;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double budget=Double.parseDouble(sc.nextLine());
        String season=sc.nextLine();
        String destination="";
        String holiday="";
        if(budget<=100.0){
            destination="Bulgaria";
            if(season.equals("summer")){budget=budget*0.30; holiday="Camp";}
            else if(season.equals("winter")){budget=budget*0.70;holiday="Hotel";}
        }
        else if(budget<=1000.0){
            destination="Balkans";

            if(season.equals("summer")){budget=budget*0.40;holiday="Camp";}
            else if(season.equals("winter")){budget=budget*0.80; holiday="Hotel";}
        }
        else {
            destination="Europe";
            budget=budget*0.90;
            holiday="Hotel";
        }

        System.out.println("Somewhere in "+destination);
        System.out.printf("%s - %.2f ",holiday,budget);
    }
}
