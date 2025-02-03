package lekciq;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        for(int i=num;i>0;i--){
            System.out.println(i);
        }
    }
}
