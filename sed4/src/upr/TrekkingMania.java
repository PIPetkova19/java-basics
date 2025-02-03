package upr;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int groupCount=Integer.parseInt(sc.nextLine());
        int mussala=0,monblan=0,kilimandjaro=0,k2=0,everest=0,countAll=0;
        for(int i=0;i<groupCount;i++){
            int peopleCount=Integer.parseInt(sc.nextLine());
            countAll+=peopleCount;
            if(peopleCount<=5)mussala+=peopleCount;
            else if(peopleCount<=12)monblan+=peopleCount;
            else if(peopleCount<=25)kilimandjaro+=peopleCount;
            else if(peopleCount<=40)k2+=peopleCount;
            else everest+=peopleCount;
        }
        System.out.printf("%.2f%%%n",1.0*mussala/countAll*100);
        System.out.printf("%.2f%%%n",1.0*monblan/countAll*100);
        System.out.printf("%.2f%%%n",1.0*kilimandjaro/countAll*100);
        System.out.printf("%.2f%%%n",1.0*k2/countAll*100);
        System.out.printf("%.2f%%%n",1.0*everest/countAll*100);
    }
}
