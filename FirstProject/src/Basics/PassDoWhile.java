package Basics;

import java.util.Scanner;

public class PassDoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter Password as 123456");
             a=sc.nextInt();
        }while (a!=123456);
        System.out.println("Correct password device unlocked");
    }
}
