package upr;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=Integer.parseInt(sc.nextLine());
        String time=sc.nextLine();
        String outfit="";
        String shoes="";
        if(time.equals("Morning")){
            if(temp>=10 && temp<=18){
                outfit="Sweatshirt";
                shoes="Sneakers";
            }
            else if(temp>18 && temp<=24){
                outfit="Shirt";
                shoes="Moccasins";
            }
            else if(temp>=25){
                outfit="T-Shirt";
                shoes="Sandals";
            }
        }
        else if(time.equals("Afternoon")){
            if(temp>=10 && temp<=18){
                outfit="Shirt";
                shoes="Moccasins";
            }
            else if(temp>18 && temp<=24){
                outfit="T-Shirt";
                shoes="Sandals";
            }
            else if(temp>=25){
                outfit="Swim Suit";
                shoes="Barefoot";
            }
        }
        else if(time.equals("Evening")){
            if(temp>=10 && temp<=18){
                outfit="Shirt";
                shoes="Moccasins";
            }
            else if(temp>18 && temp<=24){
                outfit="Shirt";
                shoes="Moccasins";
            }
            else if(temp>=25){
                outfit="Shirt";
                shoes="Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",temp,outfit,shoes);
    }
}
