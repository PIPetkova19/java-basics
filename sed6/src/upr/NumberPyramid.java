package upr;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine()),count=1;
        for(int i=1;i<=n;i++){
            if(n<count)break;
            for(int j=1;j<=i;j++) {
                System.out.printf("%d ", count++);
                if(n<count)break;

            }
            System.out.println();
        }
    }
}
