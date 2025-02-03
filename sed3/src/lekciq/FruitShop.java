package lekciq;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.nextLine();
        String day=sc.nextLine();
        double quantity=Double.parseDouble(sc.nextLine());
        if(day.equals("Monday") || day.equals("Tuesday")
                || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday"))
        {
            switch (fruit) {
                case "banana" -> System.out.printf("%.2f", quantity * 2.5);
                case "apple" -> System.out.printf("%.2f", quantity * 1.2);
                case "orange" -> System.out.printf("%.2f", quantity * 0.85);
                case "grapefruit" -> System.out.printf("%.2f", quantity * 1.45);
                case "kiwi" -> System.out.printf("%.2f", quantity * 2.7);
                case "pineapple" -> System.out.printf("%.2f", quantity * 5.5);
                case "grapes" -> System.out.printf("%.2f", quantity * 3.85);
                default -> System.out.println("error");
            }
        }
        else if(day.equals("Saturday") || day.equals("Sunday")){
            switch (fruit) {
                case "banana" -> System.out.printf("%.2f", quantity * 2.7);
                case "apple" -> System.out.printf("%.2f", quantity * 1.25);
                case "orange" -> System.out.printf("%.2f", quantity * 0.9);
                case "grapefruit" -> System.out.printf("%.2f", quantity * 1.60);
                case "kiwi" -> System.out.printf("%.2f", quantity * 3.0);
                case "pineapple" -> System.out.printf("%.2f", quantity * 5.6);
                case "grapes" -> System.out.printf("%.2f", quantity * 4.20);
                default -> System.out.println("error");
            }
        }
        else System.out.println("error");
    }
}
