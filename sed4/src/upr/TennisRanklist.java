package upr;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int countTour=Integer.parseInt(sc.nextLine());
        int startingPoints=Integer.parseInt(sc.nextLine());
        int points=0, countWin=0;
        for(int i=0;i<countTour;i++){
            String position=sc.nextLine();
            switch (position) {
                case "W" -> {
                    points += 2000;
                    countWin++;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }
    System.out.println("Final points: "+(points+startingPoints));
    System.out.println("Average points: "+points/countTour);
    System.out.printf("%.2f%%",1.0*countWin/countTour*100 );
    }

}
