package upr;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        int row=Integer.parseInt(sc.nextLine());
        int col=Integer.parseInt(sc.nextLine());
        if(type.equals("Premiere")){
            System.out.printf("%.2f leva",row*col*12.0);
        }
        else if(type.equals("Normal")){
            System.out.printf("%.2f leva",row*col*7.5);
        }
        else if(type.equals("Discount")){
            System.out.printf("%.2f leva",row*col*5.0);
        }
    }
}
