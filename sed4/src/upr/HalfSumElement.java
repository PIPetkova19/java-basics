package upr;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len =Integer.parseInt(sc.nextLine());
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<len;i++){
            int n=Integer.parseInt(sc.nextLine());
            sum+=n;
            if(n>max)max=n;
        }
        sum=sum-max;
        if(sum==max){
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        }
        else{
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(max-sum));
        }
    }
}
