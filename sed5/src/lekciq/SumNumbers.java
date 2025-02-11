package lekciq;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ogNum=Integer.parseInt(sc.nextLine());
        int sum=0;
        while(true){
            int num=Integer.parseInt(sc.nextLine());
            sum+=num;
            if(sum>=ogNum)break;
        }
        System.out.println(sum);
    }
}
