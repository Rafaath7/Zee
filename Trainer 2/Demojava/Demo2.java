import java.util.Scanner;
class Emp
{
	int id;
	String name;
	int sal =50000;
	int age;
	String desig="Dev";
	Emp()
	{	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter id : ");
		 id=sc.nextInt();

		System.out.println(" Enter Name :  ");
		name =sc.next();

		System.out.println("Enter Age  : ");
		 age =sc.nextInt();

		
	}
	void display()
	{
		System.out.println("My ID is : "+id);
		System.out.println("My name is : "+name.toUpperCase() );
		System.out.println("My AGE is : "+age  );
		System.out.println("My SALAREY is : "+sal);
		System.out.println("My DESIGis : "+desig );
	}

}
class Demo2
{
	public static void main(String args[])
	{
		 Emp a= new Emp();
		a.display();		
	}
}



