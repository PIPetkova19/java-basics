package upr;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());

        for(int i=num1;i<=num2;i++) {
            int curr = i;
            int sumOdd = 0, sumEven = 0;
            for (int j = 0; j <= 5; j++) {
                int lastDigit = curr % 10;
                curr = curr / 10;
                if (j % 2 == 0) sumEven += lastDigit;
                else sumOdd += lastDigit;
            }
            if(sumOdd==sumEven)System.out.printf("%d ",i);
        }
    }
}
