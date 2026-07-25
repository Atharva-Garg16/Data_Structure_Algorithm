package Basics;

import java.util.Scanner;
// Can lead to stack overflow
// ideal for solving problem that can be divided into subproblems of simillar type

public class Recursion {
    int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term you want of Fibonacci number: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
