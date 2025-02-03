package upr;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=Integer.parseInt(sc.nextLine());
        double priceWMaschine=Double.parseDouble(sc.nextLine());
        int priceToy=Integer.parseInt(sc.nextLine());
        int sumMoney=0,evenAge=0, toyCount=0;
        for(int i=1;i<=age;i++){
            if(i%2==0){sumMoney+=(i*5);evenAge++;}
            else toyCount++;
        }
        double result=(toyCount*priceToy)+sumMoney-evenAge;
        if(result>=priceWMaschine)System.out.printf("Yes! %.2f",result-priceWMaschine);
    else System.out.printf("No! %.2f",priceWMaschine-result);
    }
}
