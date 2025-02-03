package upr;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= count; ++i) {
            if (salary <= 0) {
            break;
        }
            String tabs = sc.nextLine();


            switch (tabs) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }
        }
        if (salary <= 0) System.out.println("You have lost your salary.");
        else System.out.println(salary);
    }
}
