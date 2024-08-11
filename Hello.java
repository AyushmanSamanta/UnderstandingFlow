/* class Trial 
{
	public static void main(String[] args) 
	{
		float p = 20.30;
		System.out.println(p);
	}
}  */

/*import java.util.Scanner;
import java.lang.*;
class Area
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of triangel: ");
		int a = sc.nextInt();
		System.out.println("Enter the second side of triangel: ");
		int b = sc.nextInt();
		System.out.println("Enter the third side of triangel: ");
		int c = sc.nextInt();
		
		//float ar = 1f/2f *(b*h);
		//float ar = 0.5f*b*h;
		//float ar = b*h/2;

		float s = (a+b+c)/2f;
		System.out.println("The s value is : " +s);

		double ar = Math.sqrt(s*(s-a)*(s-b)*(s-b));
		System.out.println("The area of the triangle is : "+ar);
	}

} */

/*import java.util.Scanner;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String a = sc.nextLine();
		System.out.println(a);

		System.out.println("Enter your Age:");
		int b = sc.nextInt();
		System.out.println(b);

		System.out.println("Enter your Salary:");
		double c = sc.nextDouble();
		System.out.println(c);
		sc.nextLine();

		System.out.println("Enter your Address:");
		String d = sc.nextLine();
		System.out.println(d);

	}
}*/

/*import java.util.Scanner;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sumEven = 0;
		int sumOdd = 0;
		System.out.println("Enter a range: ");
		int n = sc.nextInt();
		
		for(int x=0;x<=n;x++)
		{
			if(x % 2 == 0)
				{
					sumEven = sumEven+x;
		            System.out.println("Sum of Even is : "+sumEven);			

				}
							
			else
			{
				sumOdd = sumOdd+x;
				System.out.println("Sum of Odd is: "+sumOdd);
				
			}
		}
	}
} */

import java.util.Scanner;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();

		for (int i=0 ; i<n ; i++ )
		{
			for(int j=0;j<n-1;j++)
			{
				System.out.print('*');
			}
			System.out.println();

		}
	}
}