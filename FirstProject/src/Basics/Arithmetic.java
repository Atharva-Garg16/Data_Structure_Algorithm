package Basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("Please enter a new number: ");
        int divisor = input.nextInt();
        System.out.println(number/divisor); // division
        System.out.println(number%divisor);// modules
        System.out.println(number+divisor);// add
        System.out.println(number*divisor);// subtract
        System.out.println(number-divisor);// multiply
    }
}
