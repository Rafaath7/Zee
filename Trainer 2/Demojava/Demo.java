import java.util.Scanner;
class A
{
	A()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter id : ");
		int id=sc.nextInt();

		System.out.println(" Enter Name :  ");
		String name =sc.next();

		System.out.println("Enter Age  : ");
		int age =sc.nextInt();

		System.out.println("Enter Salry : ");
		int sal =sc.nextInt();

		System.out.println(" Enter Designation :  ");
		String desig=sc.next();

		System.out.println("My ID is : "+id);
		System.out.println("My name is : "+name );
		System.out.println("My AGE is : "+age  );
		System.out.println("My SALAREY is : "+sal);
		System.out.println("My DESIGis : "+desig );
		
	}
}
class Demo
{
	public static void main(String args[])
	{
		A a=new A();	
		System.out.println("==============");
		A a1=new A();	
	}
}

