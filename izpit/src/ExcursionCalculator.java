import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numPeople=Integer.parseInt(sc.nextLine());
        String season=sc.nextLine();
        double money=0.0d;
        if(numPeople<=5){
            money = switch (season) {
                case "spring" -> numPeople * 50.0;
                case "summer" -> (numPeople * 48.5) - (numPeople * 48.5) * 0.15;
                case "autumn" -> numPeople * 60.0;
                case "winter" -> (numPeople * 86.0) + (numPeople * 86.0) * 0.08;
                default -> money;
            };
        }
        else{
            money = switch (season) {
                case "spring" -> numPeople * 48.0;
                case "summer" -> (numPeople * 45.0) - (numPeople * 45.0) * 0.15;
                case "autumn" -> numPeople * 49.5;
                case "winter" -> (numPeople * 85.0) + (numPeople * 85.0) * 0.08;
                default -> money;
            };
        }
        System.out.printf("%.2f leva.",money);
    }
}
