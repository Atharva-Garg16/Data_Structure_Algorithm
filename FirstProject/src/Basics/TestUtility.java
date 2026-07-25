package Basics;

public class TestUtility {
    public  void main(String[] args) {
        int []arr=UtilityClass.inputArray();
        UtilityClass.printArray(arr);
        System.out.println("max value ="+UtilityClass.getMax(arr));
        System.out.println("min value ="+UtilityClass.getMin(arr));
        UtilityClass.reverseArray(arr);
        UtilityClass.printArray(arr);
    }
}
