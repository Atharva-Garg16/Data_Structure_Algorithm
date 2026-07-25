package Basics;

import java.util.Scanner;

 class EnhancedSwitch {
    public static void main(String[] args) {
        // Weekdays
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String day= switch (number){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Mars day";
        };
        String weekday=switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "weekday";
            case "Saturday", "Sunday" -> "weekenday";
            default -> "No day";
        };
        System.out.println(day);
        System.out.println(weekday);

    }
}
