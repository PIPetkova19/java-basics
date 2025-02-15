import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyShirt = Double.parseDouble(sc.nextLine());
        double sumPrize = Double.parseDouble(sc.nextLine());
        double moneyShorts = 0.75 * moneyShirt;
        double moneySocks = 0.2 * moneyShorts;
        double moneyShoes = 2 * (moneyShirt + moneyShorts);
        double resultMoney = (moneyShirt + moneyShorts + moneySocks + moneyShoes)
                - (moneyShirt + moneyShorts + moneySocks + moneyShoes) * 0.15;
        if (resultMoney >= sumPrize) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", resultMoney);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumPrize - resultMoney);
        }
    }
}
