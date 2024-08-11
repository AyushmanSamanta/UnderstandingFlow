/*class Nonstatic 
{
	boolean c = false;
	public static void main(String[] args) 
	{
		
	}
}*/

//-------------------------------------------------------------------------------------------------

/*class Nonstatic 
{
	int c = 1000;
	public static void main(String[] args) 
	{
		Nonstatic x = new Nonstatic();
		System.out.println(x.c);

		x.c = 10;
		System.out.println(x.c);
		
	}
}*/

//-------------------------------------------------------------------------------------------------

/* Accessing a Non-static Variable */

/*class Nonstatic 
{
	int x = 1001;
	public static void main(String[] args) 
	{
		Nonstatic t1 = new Nonstatic(); //creating an object.
		Nonstatic t2 = new Nonstatic(); //creating an object.
		System.out.println(t1.x);
		System.out.println(t2.x);

		t1.x = 2002;
		System.out.println(t1.x);
		System.out.println(t2.x);

		t2.x = 3003;
		System.out.println(t1.x);
		System.out.println(t2.x);
	}
}*/

//-------------------------------------------------------------------------------------------------
	/* Two non-static variables name cannot be same */	

/*class Nonstatic
{
	int x = 100;
	boolean x = true;   //error: variable x is already defined in class Nonstatic
        
	public static void main(String[] args)
	{
		Nonstatic a = new Nonstatic();
		System.out.println(a.x);
	}
}*/

//--------------------------------------------------------------------------------------------------

/* WAP to print the default value of datatypes */

class Nonstatic
{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	public static void main(String [] args)
	{
		Nonstatic x = new Nonstatic();

		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
		System.out.println(x.e);
		System.out.println(x.f);
		System.out.println(x.g);
		System.out.println(x.h);
	}

}