package lekciq;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<=str.length()-1;i++)
            System.out.println(str.charAt(i));
    }
}
