/* WAP to print alternate even numbers between a given range */

import java.util.Scanner;
class AlternateEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n = sc.nextInt();

		for (int i=1;i<=n ;i++)
		{
			if(i % 4 == 2)
			{
				System.out.println(i+" are the even numbers.");
			}
		}
		
	}
}
  