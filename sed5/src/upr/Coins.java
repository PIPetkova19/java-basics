package upr;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double coinSum=Double.parseDouble(sc.nextLine());
        int[] coinArr= {1, 2, 5, 10, 20, 50, 100, 200};
        coinSum*=100;
        int money=(int)coinSum;
        int count=0;
        while(money>0){
            if(money>=coinArr[7]){money-=coinArr[7];count++; continue;}
            if(money>=coinArr[6]){money-=coinArr[6];count++;continue;}
            if(money>=coinArr[5]){money-=coinArr[5];count++;continue;}
            if(money>=coinArr[4]){money-=coinArr[4];count++;continue;}
            if(money>=coinArr[3]){money-=coinArr[3];count++;continue;}
            if(money>=coinArr[2]){money-=coinArr[2];count++;continue;}
            if(money>=coinArr[1]){money-=coinArr[1];count++;continue;}
            money -= coinArr[0];count++;
        }
        System.out.println(count);
    }
}
