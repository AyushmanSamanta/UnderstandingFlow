/* Program to count the number of digits of any number */

import java.util.Scanner;
class Digits
 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int count = 0;

		while(num>0)
		{
			count++;
			num=num/10;
		}

		System.out.println("The number of digits are "+count);
	}
}
