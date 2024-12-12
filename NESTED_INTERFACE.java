interface out{
    void outm();
    interface in{
        void inm();
    }
}
public class NESTED_INTERFACE implements out.in 
{
        public void inm()
        {
            System.out.println("Hello i am here");
        }
        public static void main(String[] args)
        {
            NESTED_INTERFACE n=new NESTED_INTERFA();
            n.inm();
        }
    }


