package lekcii;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numFloors=Integer.parseInt(sc.nextLine());
        int numRooms=Integer.parseInt(sc.nextLine());
        for(int i=numFloors;i>=1;i--){
            for(int j=0;j<numRooms;j++){
if(i==numFloors)System.out.printf("L%d%d ",i,j);
else if(i%2==0)System.out.printf("O%d%d ",i,j);
else System.out.printf("A%d%d ",i,j);
            }
            System.out.println();
        }
    }
}
