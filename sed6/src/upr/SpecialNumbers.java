package upr;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine()),count=0;
        for(int i=1111;i<=9999;i++){
            int curr=i;
            for(int j=0;j<=3;j++){
                int lastDigit=curr%10;
                curr=curr/10;
                if(lastDigit==0)continue;
                if(n%lastDigit==0)count++;
            }
            if(count==4)System.out.printf("%d ",i);
            count=0;
        }
    }
}
