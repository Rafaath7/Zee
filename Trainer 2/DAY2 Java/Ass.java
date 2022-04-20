import java.util.*;

class emp
{
	int id;
	String name;
	int sal;
	int age;
	String desig;

	emp()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter id : ");
		 id=sc.nextInt();

		System.out.println(" Enter Name :  ");
		name =sc.next();

		System.out.println("Enter Age  : ");
		 age =sc.nextInt();

		 System.out.println("Enter sal  : ");
		 sal =sc.nextInt();

		 System.out.println("Enter Age  : ");
		 desig =sc.next();
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

class clerk extends emp{
	clerk()
	{

	}
}

class Dev extends emp{
	Dev()
	{
		
	}
}

class Tester extends emp{
	Tester()
	{
		
	}
}

class Ass
{
	public static void main(String args[])
	{
		clerk c= new clerk();
		c.display();

		Dev d= new Dev();
		d.display();

		Tester t= new Tester();
		t.display();


	}
}
