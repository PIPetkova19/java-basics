package lekciq;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        String str=sc.nextLine();
        while(!str.equals("Stop")){
            int n=Integer.parseInt(str);
            if(n>max)max=n;
            str=sc.nextLine();
        }
        System.out.println(max);
    }
}
