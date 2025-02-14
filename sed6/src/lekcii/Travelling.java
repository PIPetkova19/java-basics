package lekcii;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String destination = sc.nextLine();

        while (!destination.equals("End")) {
            double moneyNeeded = Double.parseDouble(sc.nextLine());
            double sum = 0;

            while (sum < moneyNeeded) {
                sum += Double.parseDouble(sc.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
            destination = sc.nextLine();
        }
    }
}
