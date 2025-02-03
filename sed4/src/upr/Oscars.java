package upr;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nameActor=sc.nextLine();
        double academyPoints=Double.parseDouble(sc.nextLine());
        int judgeCount=Integer.parseInt(sc.nextLine());
        double sum=academyPoints;
        for(int i=0;i<judgeCount;i++){
            String nameJudge=sc.nextLine();
            double points=Double.parseDouble(sc.nextLine());
            sum+=(nameJudge.length()*points)/2;
            if(sum>1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameActor,sum);
                break;
            }
        }
        if(sum<=1250.5)  System.out.printf("Sorry, %s you need %.1f more!",nameActor,1250.5-sum);

    }
}
