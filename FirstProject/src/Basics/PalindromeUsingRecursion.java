package Basics;

import java.util.Scanner;

public class PalindromeUsingRecursion {
    static boolean isPalindrome(String str) {
        if(str.length() <= 1) {
            return true;
        }
        else if(str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        else  {
            return false;
        }

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        }
        else {
            System.out.println(str + " is not a palindrome.");
        }

    }
}
