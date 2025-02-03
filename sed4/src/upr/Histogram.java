package upr;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
        int p1=0,p2=0,p3=0,p4=0,p5=0;
        for(int i=0;i<length;i++){
            int n = Integer.parseInt(sc.nextLine());
            if(n<200)p1++;
            else if(n<=399)p2++;
            else if(n<=599)p3++;
            else if(n<=799)p4++;
            else p5++;
        }
        System.out.printf("%.2f%%%n",(double)p1/length*100);
        System.out.printf("%.2f",(double)p2/length*100);
        System.out.println("%");
        System.out.printf("%.2f",(double)p3/length*100);
        System.out.println("%");
        System.out.printf("%.2f",(double)p4/length*100);
        System.out.println("%");
        System.out.printf("%.2f",(double)p5/length*100);
        System.out.println("%");

    }
}
