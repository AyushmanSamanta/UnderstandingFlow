/*class Local
{
	public static void main(String[] args)
	{ 
	//	int x = 10; //Local variable
	}
}  */
// --------------------------------------------------------------------------------------------------		
	/* Default value concept is not applicable for local variable.*/	
		
		/* class Local{
			 public static void main(String[] args){
				 int x; 
				 System.out.println(x); //Compile error: variable x might not have been initialized
				 }
			}  */
// --------------------------------------------------------------------------------------------------						 
	/*    class Local{
			public static void main(String[] args){
				int x; //No Error, as we are not using this variable.
				}
			}  */
// --------------------------------------------------------------------------------------------------	
	/*Two local variable names cannot be same. */
	
	/* class Local{
		 public static void main(String[] args){
			int x = 10;
			double x = 11.11;  // error: variable x is already defined in method main(String[])
		}
	}  */
//---------------------------------------------------------------------------------------------------				

/* Local and Static variable name can be same*/

/*class Local
{
	static int x = 10;
	public static void main(String[] args)
	{
		int x = 20; // Priority will be given
		System.out.println(x);
	}
} */

//---------------------------------------------------------------------------------------------------

/* WAP to access all the variables in a Single program */

class Local
{
	int x = 10;
	static double z = 11.11;
	public static void main(String[] args){
		float p = 12.31f;
		
		Local a = new Local();         //Object declared.

		System.out.println(a.x);      //Non-static accessed through object.
		System.out.println(z);        //Static accessed directly.
		System.out.println(Local.z);  //Static accessed through class.
		System.out.println(a.z);      //Static accessed through object.
		System.out.println(p);        //Local accessed directly.
		}
}