/* How to access a Static variable */

/*class Static 
{
	static int x = 10;  //Declaration of static variable.
	public static void main(String[] args) 
	{
		System.out.println(x);  //Directly accessed.

		System.out.println(Static.x);  //By class name.

		Static a = new Static();
		System.out.println(a.x);  //By object reference.
	}
}*/

//-------------------------------------------------------------------------------------------------

/* Static variable name and non-static variable name cannot be same */ 

class Static
{
	static int x = 10;
	int x = 10;             //error: variable x is already defined in class Static 

	public static void main(String[] args)
	{
		Static a = new Static();
		System.out.println(a.x);
	}
} 

//-------------------------------------------------------------------------------------------------