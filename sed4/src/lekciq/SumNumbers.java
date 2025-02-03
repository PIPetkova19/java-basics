package lekciq;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
        int sum=0;
        for(int i=0;i<length;i++){
            int n=Integer.parseInt(sc.nextLine());
            sum+=n;
        }
        System.out.println(sum);
    }
}
