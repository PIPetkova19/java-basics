package upr;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int freeSpaceWidth=Integer.parseInt(sc.nextLine());
        int freeSpaceLength=Integer.parseInt(sc.nextLine());
        int freeSpaceHeight=Integer.parseInt(sc.nextLine());
        int freeSpace=freeSpaceHeight*freeSpaceLength*freeSpaceWidth;
        String str=sc.nextLine();
        int sumSpace=0;
        while(!str.equals("Done") ){
            int num=Integer.parseInt(str);
            sumSpace+=num;
            if(freeSpace-sumSpace<0)break;
            str=sc.nextLine();
        }
        if(freeSpace-sumSpace<=0)System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(freeSpace-sumSpace));
    else System.out.printf("%d Cubic meters left.",freeSpace-sumSpace);
    }
}
