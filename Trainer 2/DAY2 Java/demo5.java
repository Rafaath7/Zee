final class car 
{
        final int speed = 200;
        int wel = 4;
        string model= "xyz";
        final void loan()
        {
                System.out.println("5%");
        }
}

class BMW extends car 
{
    void loan()
    {
        System.out.println("4%");
    }
}
class demo5 
{
    public static void main (String args[])
    {
        BMW c = new BMW();
        //c.speed=2000;
        System.out.println(c.speed);
        c.loan();
        
    }
}