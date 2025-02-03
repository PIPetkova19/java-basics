package lekciq;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
        int sumOdd=0,sumEven=0;
        for(int i=0;i<length;i++){
            if(i%2==0)sumEven+=Integer.parseInt(sc.nextLine());
            else sumOdd+=Integer.parseInt(sc.nextLine());
        }
        if(sumEven==sumOdd){
            System.out.println("Yes");
        System.out.printf("Sum = %d",sumEven);
        }
        else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sumEven-sumOdd));
        }
    }
}
