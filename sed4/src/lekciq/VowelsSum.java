package lekciq;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int sum=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='a')sum+=1;
            else if(str.charAt(i)=='e')sum+=2;
            else if(str.charAt(i)=='i')sum+=3;
            else if(str.charAt(i)=='o')sum+=4;
            else if(str.charAt(i)=='u')sum+=5;
        }
        System.out.println(sum);
    }
}
