package upr;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=Integer.parseInt(sc.nextLine());
        int n2=Integer.parseInt(sc.nextLine());
        char operator= sc.nextLine().charAt(0);
        if(n2==0){
            System.out.printf("Cannot divide %d by zero",n1);
        }
        else {
            if (operator == '+') {
                if ((n1 + n2) % 2 == 0) System.out.printf("%d %c %d = %d - even", n1, operator, n2, n1 + n2);
                else System.out.printf("%d %c %d = %d - odd", n1, operator, n2, n1 + n2);
            } else if (operator == '-') {
                if ((n1 - n2) % 2 == 0) System.out.printf("%d %c %d = %d - even", n1, operator, n2, n1 - n2);
                else System.out.printf("%d %c %d = %d - odd", n1, operator, n2, n1 - n2);
            } else if (operator == '*') {
                if ((n1 * n2) % 2 == 0) System.out.printf("%d %c %d = %d - even", n1, operator, n2, n1 * n2);
                else System.out.printf("%d %c %d = %d - odd", n1, operator, n2, n1 * n2);
            } else if (operator == '/') {
                System.out.printf("%d %c %d = %.2f", n1, operator, n2, (double) n1 / n2);
            } else if (operator == '%') {
                System.out.printf("%d %c %d = %d", n1, operator, n2, n1 % n2);
            }
        }

    }
}
