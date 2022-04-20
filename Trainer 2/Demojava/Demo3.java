import java.util.Scanner;
class Tester
{
	int id=0;
	String name=null;
	int sal=40000;
	int age=0;
	String desig="Tester";

	void create()
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

	void raise()
	{
		sal=sal+5000;
	}

}
class Dev
{
	int id=0;
	String name=null;
	int sal=50000;
	int age=0;
	String desig="Dev";
	void create()
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

	void raise()
	{
		sal=sal+5000;
	}

}

class manager
{
	int id=0;
	String name=null;
	int sal=60000;
	int age=0;
	String desig="Manager";
	void create()
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

	void raise()
	{
		sal=sal+5000;
	}

}

class clerk
{
	int id=0;
	String name =null;
	int sal=70000;
	int age=0;
	String desig="Clerk";
	void create()
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

	void raise()
	{
		sal=sal+5000;
	}

}
class Demo3
{
	




Dev d=new Dev();
Tester t=new Tester();
manager m=new manager();
clerk c=new clerk();




public void menu2()
	{
			System.out.println("1 ) Devloper ");
			System.out.println("2 ) Tester ");
			System.out.println("3 ) manager ");
			System.out.println("4 ) Clerk");
			System.out.println("5 ) Exit");	

			System.out.println(" Enter the Person to raise salary ");

			Scanner sc1=new Scanner(System.in);

			int ch1=sc1.nextInt();	

			if(ch1==1)
			{
				d.raise();
	                   return;
			}
			if(ch1==2)
			{
			t.raise();
			return;
			}
			if(ch1==3)
			{
			m.raise();
			return;
			}
			if(ch1==4)
			{
			c.raise();
			return;
			}
			if(ch1==5)
			{
			return;
			}
	}









	public void menu()
	{
			System.out.println("1 ) Devloper ");
			System.out.println("2 ) Tester ");
			System.out.println("3 ) manager ");
			System.out.println("4 ) Clerk");
			System.out.println("5 ) Exit");	

			System.out.println(" Enter the Choice ");

			Scanner sc1=new Scanner(System.in);

			int ch1=sc1.nextInt();	

			if(ch1==1)
			{
				d.create();
	                   return;
			}
			if(ch1==2)
			{
			t.create();
			return;
			}
			if(ch1==3)
			{
			m.create();
			return;
			}
			if(ch1==4)
			{
			c.create();
			return;
			}
			if(ch1==5)
			{
			return;
			}
	}
	public static void main(String args[])
	{
		while(true)
{
		System.out.println("1 ) Create ");
		System.out.println("2 ) Display ");
		System.out.println("3 ) Raise Salary ");
		System.out.println("4 ) Exit");


		
		System.out.println(" Enter the Choice ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			
			menu();
			

		}
		if(ch==2)
		{
			
			d.display();
			t.display();
			m.display();
			c.display();
			
				
		}

		if(ch==3)
		{
			menu2();
		}

		
		if(ch==4)
		{
			System.out.println("Thank you ....! ");
			System.exit(0);
		}

		
}
		
		
			
	}
}


				








