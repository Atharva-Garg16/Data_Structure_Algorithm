package Basics;

public class array1D {
    public static void main(String[] args) {
        int [] arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr2[]={1,2,4,5,6,7,8,9};
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
