package OOPs;

public class CodeBlocks {
    static int a,b,c;
    static {
        // yaha apan saare static variable initialize kr skte hai
        // called when class is loaded ek hi baar call hoga
         a=0;
         b=0;
         c=0;
    }
    {
        a++;
        // called at time of object creation just like constructor
        // even called before constructor
    }
    public static void main(String[] args) {
        System.out.println(CodeBlocks.a);
    }
}
