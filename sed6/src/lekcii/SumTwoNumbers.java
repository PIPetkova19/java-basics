package lekcii;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=Integer.parseInt(sc.nextLine());
        int end=Integer.parseInt(sc.nextLine());
        int magic=Integer.parseInt(sc.nextLine());
        boolean flag=false;
        int count=0; //!
        for(int i=start;i<=end;i++){
            for(int j=start;j<=end;j++) {
                count++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d", count);
                    System.out.printf(" (%d + %d = %d)%n", i,j,i+j);
                    flag = true;
                    break;
                }
            }
            if(flag)break;
        }
        if(!flag)System.out.printf("%d combinations - neither equals %d",count,magic);
    }
}
