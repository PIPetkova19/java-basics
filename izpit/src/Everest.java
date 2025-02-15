import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sleep = sc.nextLine();
        int metresSum = 5364, count = 1;
        while (!sleep.equals("END") && count <= 5) {
            if (sleep.equals("Yes")) {
                count++;
                if (count > 5) break;
            }
            int climbedMetres = Integer.parseInt(sc.nextLine());
            metresSum += climbedMetres;
            if (metresSum >= 8848) break;
            sleep = sc.nextLine();
        }
        if (metresSum < 8848) System.out.printf("Failed!%n%d", metresSum);
        else System.out.printf("Goal reached for %d days!", count);
    }
}
