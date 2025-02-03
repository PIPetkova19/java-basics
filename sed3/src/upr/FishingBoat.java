package upr;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int budget=Integer.parseInt(sc.nextLine());
        String season=sc.nextLine();
        int numFishers=Integer.parseInt(sc.nextLine());
        double shipRent=0.0;

        switch(season){
            case "Spring"-> shipRent=3000.0;
            case "Summer","Autumn"->shipRent=4200.0;
            case "Winter"->shipRent=2600.0;
        }



        if(numFishers<=6)shipRent=shipRent-shipRent*0.1;
        else if(numFishers<=11)shipRent=shipRent-shipRent*0.15;
        else shipRent=shipRent-shipRent*0.25;

        if(numFishers%2==0 && !(season.equals("Autumn"))) {
            shipRent=shipRent-shipRent*0.05;
        }


       if(budget>=shipRent)System.out.printf("Yes! You have %.2f leva left.",(double)budget-shipRent);
    else System.out.printf("Not enough money! You need %.2f leva.",shipRent-budget);
    }
}
