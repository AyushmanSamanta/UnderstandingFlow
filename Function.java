/*class Function 
{
	public void m1(int x)
	{
		System.out.println("general method");
	}
	public void m1(int ... x)
	{
		System.out.println("var-arg method");
	}
	public void m1(Object o)
	{
		System.out.println("Object Version");
	}

	public void m1(String s)
	{
		System.out.println("String version");
	}

	public void m1(StringBuffer sb)
	{
		System.out.println("String Buffer Version");
	}

	public void m1(float f)
	{
		System.out.println("float-arg method");
	}

	public void m1(int i,float f)
	{
		System.out.println("int-float");
	}
	public void m1(float f,int i)
	{
		System.out.println("float-int");
	}

	public static void main(String[] args) 
	{
		Function f = new Function();
		f.m1(10,10.5f);		
		f.m1(10.5f,10);
		f.m1(10,10);
		f.m1(10.5f);
		f.m1('a');
		f.m1(10L);

		f.m1(new Object());

		f.m1("Ayushman");
		f.m1(new StringBuffer("Ayushman"));
		f.m1(null);
	}

}*/


class Animal
{

}
class Monkey extends Animal
{
}

class Function
{
	public void m1(Animal a)
	{
		System.out.println("Animal Version");
	}
	public void m1(Monkey m)
	{
		System.out.println("Monkey Version");
	}
	
	public static void main(String[] args)
	{
		Function f = new Function();
		Animal a = new Animal();
		f.m1(a);
		
		Monkey m = new Monkey();
		f.m1(m);
		
		Animal a1 = new Monkey();
		f.m1(a1);
	}
}





