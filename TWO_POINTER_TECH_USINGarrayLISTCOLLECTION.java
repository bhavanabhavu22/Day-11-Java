import java.util.*;
public class TWO_POINTER_TECH_USINGarrayLISTCOLLECTION {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(34);
        a.add(567);
        a.add(314);
        int l=0;
        int r=a.size()-1;
        while(l<r)
        {
            int temp=a.get(r);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
    }
}