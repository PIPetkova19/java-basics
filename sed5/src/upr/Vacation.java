package upr;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(sc.nextLine());
        double moneyAvailable = Double.parseDouble(sc.nextLine());
        int countSpend = 0, countAll = 0;
        while (countSpend < 5 && moneyAvailable<moneyNeeded) {
            String str = sc.nextLine();
            double money = Double.parseDouble(sc.nextLine());
            countAll++;
            if (str.equals("spend")) {
                moneyAvailable -= money;
                countSpend++;
                if(moneyAvailable<0)moneyAvailable=0;
            }
            else if (str.equals("save")) {moneyAvailable += money;countSpend=0;}
        }
        if (countSpend == 5) {
            System.out.println("You can't save the money.");
     System.out.println(countAll);
        }
        if(moneyNeeded<=moneyAvailable)System.out.printf("You saved the money for %d days.",countAll);
    }
}
