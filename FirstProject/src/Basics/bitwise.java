package Basics;

public class bitwise {
    public static void main(String[] args) {
        int a=5;
        int b=34;
        System.out.println(a^b);// XOR OPERATION
        System.out.println(a&b);// AND OPERATION
        System.out.println(a|b);// OR OPERATION
        System.out.println(~b);// NOT
        System.out.println(~a);
        System.out.println(a>>1);// right shift
        System.out.println(a<<1); // left shift
    }
}
