/* A program to check whether the number is peterson number or not */

import java.util.Scanner;
class Peterson 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int num = sc.nextInt();
		int fact = 1;
		int sum = 0;
		int rem = 0;
		int temp = num;
		
		while(num>0)
		{
			rem = num % 10;
			for(int i=rem;i>=1;i--)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
			fact = fact/fact;

		}
		if(temp == sum)
		{
			System.out.println(temp+" is a peterson number.");
		}
		else
		{
			System.out.println(temp+" is not a peterson number.");
		}

	}
}
