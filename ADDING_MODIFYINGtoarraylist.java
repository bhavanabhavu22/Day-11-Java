import java.util.*;
class ADDING_MODIFYINGtoarraylist
{

public static void main(String args[])
{
    ArrayList<Integer> a=new ArrayList<>();
    a.add(223);
    a.add(45);
    a.add(678);
    //adding at particular index
    a.add(1,345);
    //modifying the numbers
    a.set(2,4567);
    System.out.println(a);

}
}