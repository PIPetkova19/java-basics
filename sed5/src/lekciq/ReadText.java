package lekciq;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String word=sc.nextLine();
            if(word.equals("Stop"))break;
            System.out.println(word);
        }
    }
}
