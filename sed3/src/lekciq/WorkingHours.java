package lekciq;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=Integer.parseInt(sc.nextLine());
        String day=sc.nextLine();
        if(day.equals("Monday") || day.equals("Tuesday")
                || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday") || day.equals("Saturday")){
            if(hour>=10 && hour<=18) System.out.println("open");
            else System.out.println("closed");
        }
        if(day.equals("Sunday"))System.out.println("closed");
    }
}
