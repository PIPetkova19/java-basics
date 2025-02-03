package lekciq;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
    int max= Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            int n=Integer.parseInt(sc.nextLine());
            if(max<n)max=n;
            if(min>n)min=n;
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}
