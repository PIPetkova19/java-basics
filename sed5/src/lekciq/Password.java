package lekciq;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String ogPass=sc.nextLine();
        String pass=sc.nextLine();
        while(true){
            if(!pass.equals(ogPass))pass=sc.nextLine();
            else{System.out.printf("Welcome %s!",name);break;}
        }
    }
}