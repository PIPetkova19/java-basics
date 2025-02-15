import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPeople = Integer.parseInt(sc.nextLine());
        int numNight = Integer.parseInt(sc.nextLine());
        int numCards = Integer.parseInt(sc.nextLine());
        int numTickets = Integer.parseInt(sc.nextLine());
        double moneyNight = numNight * 20.0;
        double moneyCard = numCards * 1.60;
        double moneyTicket = numTickets * 6.0;
        double moneyOnePerson = moneyNight + moneyCard + moneyTicket;
        double moneyAllPeople = moneyOnePerson * numPeople;
        double result = moneyAllPeople + moneyAllPeople * 0.25;
        System.out.printf("%.2f", result);
    }
}
