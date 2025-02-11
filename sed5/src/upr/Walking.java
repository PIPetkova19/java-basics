package upr;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, steps;
        String str = sc.nextLine();
        while (sum <= 10000) {
            if(str.equals("Going home")){
                steps=Integer.parseInt(sc.nextLine());
                sum+=steps;
                if(sum>=10000){
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!",sum-10000);
                }
                break;
            }
            else{
                steps=Integer.parseInt(str);
                sum+=steps;
                if(sum>=10000){
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!",sum-10000);
                break;
                }
            }
            str=sc.nextLine();
        }
        if(sum<10000)System.out.printf("%d more steps to reach goal.",10000-sum);

    }
}
