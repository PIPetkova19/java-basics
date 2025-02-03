package lekciq;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String city=sc.nextLine();
        double quantity=Double.parseDouble(sc.nextLine());
        if(city.equals("Sofia")){
            if(quantity>=0 && quantity<=500)System.out.printf("%.2f",quantity*0.05);
            else if(quantity>500 && quantity<=1000)System.out.printf("%.2f",quantity*0.07);
            else if(quantity>1000 && quantity<=10000)System.out.printf("%.2f",quantity*0.08);
            else if(quantity>10000)System.out.printf("%.2f",quantity*0.12);
            else System.out.println("error");
        }
        else if(city.equals("Varna")){
            if(quantity>=0 && quantity<=500)System.out.printf("%.2f",quantity*0.045);
            else if(quantity>500 && quantity<=1000)System.out.printf("%.2f",quantity*0.075);
            else if(quantity>1000 && quantity<=10000)System.out.printf("%.2f",quantity*0.1);
            else if(quantity>10000)System.out.printf("%.2f",quantity*0.13);
            else System.out.println("error");
        }
        else if(city.equals("Plovdiv")){
            if(quantity>=0 && quantity<=500)System.out.printf("%.2f",quantity*0.055);
            else if(quantity>500 && quantity<=1000)System.out.printf("%.2f",quantity*0.08);
            else if(quantity>1000 && quantity<=10000)System.out.printf("%.2f",quantity*0.12);
            else if(quantity>10000)System.out.printf("%.2f",quantity*0.145);
            else System.out.println("error");
        }
        else System.out.println("error");
    }

}
