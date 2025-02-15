import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numComp=Integer.parseInt(sc.nextLine());
        double numSales=0.0d, avgRating=0.0d,count=numComp;
        while(numComp!=0){
            int ratingSales=Integer.parseInt(sc.nextLine());
            int rating=ratingSales%10;
            int sales=ratingSales/10;
            avgRating+=rating;
            switch (rating){
                case 2:numSales+=sales*0.0;break;
                case 3:numSales+=sales*0.5;break;
                case 4:numSales+=sales*0.7;break;
                case 5:numSales+=sales*0.85;break;
                case 6:numSales+=sales*1.0;break;
            }
            numComp--;
        }
        System.out.printf("%.2f%n",numSales);
        System.out.printf("%.2f%n",avgRating/count);
    }
}
