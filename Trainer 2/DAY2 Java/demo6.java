class A 
{
    A(int a)
    {
        this(100,"tanesh");// Should always be first line 
        System.out.println("a(int a)");
    }

    A(int a, String name )
    {
        this();
        System.out.println("A(int a,STring name )");
    }

    A()
    {
        System.out.println("A()");

    }

    public void abc()
    {
        System.out.println("My logic");

    }

    public void abc(int a)
    {
        System.out.println("My logic");
        
    }
}

class B extends A 
{
    // A()
    // {
    //     System.out.println("A()");

    // }
    public void abc()
    {
        System.out.println("My Extra logic ");
    }
}


public class demo6 {
    
public static void main(String args[])
{
    A a = new A(100);
    a.abc();
    B b= new B();
    b.abc();
}


}
