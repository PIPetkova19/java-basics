package upr;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String searchBook=sc.nextLine();
        int count=0;
        while(true){
            String books=sc.nextLine();
            if(books.equals("No More Books"))break;
            if(!searchBook.equals(books)) count++;
            else {System.out.printf("You checked %d books and found it.",count);return;}
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.",count);
    }
}
