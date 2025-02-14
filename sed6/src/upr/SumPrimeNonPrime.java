package upr;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String str=sc.nextLine();
int sumPrime=0,sumNon=0;
while(!str.equals("stop")){
    int num=Integer.parseInt(str);
    int dividersCount=0;
    if(num<0){System.out.println("Number is negative.");str=sc.nextLine();continue;}

    for(int i=1;i<=num;i++){
        if(num%i==0){
            dividersCount++;
        }}
    if(dividersCount>2)sumNon+=num;
    else sumPrime+=num;
    str=sc.nextLine();
}
System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
System.out.printf("Sum of all non prime numbers is: %d%n",sumNon);
    }
}
