package Basics;

import java.util.Scanner;

public class TernaryOperator {
    static void main() {

        // Variable=Expression? True Value: False Value;
        // Not for complex expression as 📉 readability
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String canVote=num>18?"Ja de de vote":"baccha hai tu abhi";
        System.out.println(canVote);
    }
}
