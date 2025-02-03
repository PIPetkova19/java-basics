package upr;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dayCount=Integer.parseInt(sc.nextLine());
        String roomType=sc.nextLine();
        String review= sc.nextLine();

        double price=0.0;
        dayCount=dayCount-1;
        switch (roomType) {
            case "room for one person" -> price = 18.0 * dayCount;
            case "apartment" -> {
                price = 25.0 * dayCount;
                if (dayCount < 10) price = price - price * 0.3;
                else if (dayCount <= 15) price = price - price * 0.35;
                else price = price - price * 0.5;
            }
            case "president apartment" -> {
                price = 35.0 * dayCount;
                if (dayCount < 10) price = price - price * 0.1;
                else if (dayCount <= 15) price = price - price * 0.15;
                else price = price - price * 0.2;
            }
        }
        if(review.equals("positive"))price=price+price*0.25;
        else if (review.equals("negative"))price=price-price*0.1;

        System.out.printf("%.2f",price);
    }
}
