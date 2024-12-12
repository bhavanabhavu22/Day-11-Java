import java.util.*;
interface print {
    public int operation(int a,int b);
}
public class MATH {
    public static void main(String args[])
    {
        print add=(a,b)->a+b;
        print sub=(a,b)->a-b;
        System.out.println(add.operation(4,5));
        System.out.println(sub.operation(5,7));
    }
}
