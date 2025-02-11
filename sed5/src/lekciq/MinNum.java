package lekciq;

import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        String str=sc.nextLine();
        while(!str.equals("Stop")){
            int n=Integer.parseInt(str);
            if(n<min)min=n;
            str=sc.nextLine();
        }
        System.out.println(min);
    }
}
