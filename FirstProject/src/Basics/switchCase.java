package Basics;

import java.util.Scanner;

// Java supported types integer type , floating pt, String , char ,enum
public class switchCase {
    public static void main(String[] args) {
        // Traffic Light
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a colour of traffic light: ");
        String colour = input.nextLine();
        switch (colour.toLowerCase()) {
            case "red":
                System.out.print("Stop the vehicle ");
                break;
            case "green":
                System.out.print("Go signal is green ");
                break;
            case "yellow":
                System.out.print("Get ready to go ");
                break;
            default:
                System.out.print("Invalid colour");
        }
    }
}
