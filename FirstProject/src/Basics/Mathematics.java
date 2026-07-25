package Basics;

import java.util.Arrays;

public class Mathematics {
    static void main() {
        /// Math class methods are static can be accessed directly

        int a=Math.abs(-100);// absolute value
        System.out.println(a);
        double b=Math.pow(24,3);// power function pow(base,exp)
        System.out.println(b);
        int c= (int) Math.ceil(1.44);// ceiling value 1.4=>2
        System.out.println(c);
        double d=Math.floor(1.44);// floor value 1.9 => 1
        System.out.println(d);
        double e=Math.round(1.44);// roundoff
        System.out.println(e);
        System.out.println("value of pi = "+Math.PI);
        int an=Math.max(90,12);// Returns the greater of two  values
        System.out.println(an);
        int bn=Math.min(24,30);// Returns the smaller of two  values
        System.out.println(bn);
        double cn=Math.random();//Returns a double value greater than or equal to 0.0 and less than 1.0.
        System.out.println(cn);

    }
}
