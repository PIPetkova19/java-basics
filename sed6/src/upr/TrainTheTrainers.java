package upr;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numTrainers=Integer.parseInt(scanner.nextLine());
        String name= scanner.nextLine();
        double avg=0, sumAvg=0, countProject=0;
        while(!name.equals("Finish")){
            for(int i=0;i<numTrainers;i++){
                avg+=Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("%s - %.2f.%n",name,avg/numTrainers);
            countProject++;
            sumAvg+=avg;
            avg=0;
            name= scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",sumAvg/(countProject*numTrainers));
    }
}
