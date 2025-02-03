package lekciq;

import java.util.Scanner;

public class EvenPowers2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        for(int i=0;i<=num;i+=2){
            System.out.println((int)Math.pow(2,i));
        }
    }
}
