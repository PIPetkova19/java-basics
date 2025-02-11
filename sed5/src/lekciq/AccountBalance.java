package lekciq;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0.0d;
        String str=sc.nextLine();
        while(!str.equals("NoMoreMoney")) {
            double num = Double.parseDouble(str);
            if (num < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += num;
            System.out.printf("Increase: %.2f%n", num);
            str = sc.nextLine();
        }
        System.out.printf("Total: %.2f",sum);
    }
}
