package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class UtilityClass {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter"+ (i+1) +" element of array");
        arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        return min;
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverseArray(int[] arr) {
        for (int i = 0;i<arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
}
