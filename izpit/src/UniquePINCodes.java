import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstRange = Integer.parseInt(sc.nextLine());
        int secondRange = Integer.parseInt(sc.nextLine());
        int thirdRange = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= firstRange; i++)
            for (int j = 1; j <= secondRange; j++)
                for (int k = 1; k <= thirdRange; k++)
                    if ((i % 2 == 0) &&
                            (j == 2 || j == 3 || j == 5 || j == 7)
                            && (k % 2 == 0)) System.out.printf("%d %d %d%n", i, j, k);

    }
}
