import java.util.*;
public class array_size {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(678);
        a.add(678);
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            b[i]=a.get(i);
            System.out.println(Arrays.toString(b));
        }
    }
}
