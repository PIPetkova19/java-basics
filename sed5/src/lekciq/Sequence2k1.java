package lekciq;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int n=1;
        while(num>=n){
            System.out.println(n);
            n=n*2+1;
        }
    }
}
