
import java.util.*;
public class CONTAINS_ARRAY {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(34);
        a.add(56);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
        a.add(2);
        a.add(34);
        System.out.println(a.contains(2));
        System.out.println(a.contains(8));

    }
}
