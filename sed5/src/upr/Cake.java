package upr;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=Integer.parseInt(sc.nextLine());
        int width=Integer.parseInt(sc.nextLine());
        int slices=height*width,oldSlices=slices;
        int all=0;
        String str=sc.nextLine();
        while(true){
            if(str.equals("STOP"))break;
            int pieces=Integer.parseInt(str);
            slices-=pieces;
            all+=pieces;
            if(slices<=0){System.out.printf("No more cake left! You need %d pieces more.",all-oldSlices );break;}

            str=sc.nextLine();
        }
        if(oldSlices>all)System.out.printf("%d pieces are left.", oldSlices-all);
    }
}
