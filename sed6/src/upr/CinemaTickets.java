package upr;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int count=0,countAll=0,studentC=0,standardC=0,kidC=0,freeSeats=0;
        while(!name.equals("Finish")){
            freeSeats=Integer.parseInt(sc.nextLine());
            String ticket=sc.nextLine();
            while(!ticket.equals("End")) {
                count++;

                switch (ticket) {
                    case "standard" -> standardC++;
                    case "kid" -> kidC++;
                    case "student" -> studentC++;
                }
                if(count>=freeSeats)break; //!
                ticket=sc.nextLine();
            }
            countAll+=count;

           System.out.printf("%s - %.2f%% full.%n",name,1.0*count/freeSeats*100);
            count=0;
            name=sc.nextLine();
        }
        System.out.printf("Total tickets: %d%n",countAll);
        System.out.printf("%.2f%% student tickets.%n",1.0*studentC/countAll*100.0);
        System.out.printf("%.2f%% standard tickets.%n",1.0*standardC/countAll*100.0);
        System.out.printf("%.2f%% kids tickets.%n",1.0*kidC/countAll*100.0);
    }
}
