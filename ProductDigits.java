/* Program to print the product of digits of any number */

import java.util.Scanner;
class ProductDigits
 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int prod = 1;
		int rem = 0;

		while(num>0)
		{
			rem = num % 10;
			prod = prod * rem;
			num=num/10;
		}

		System.out.println(prod+" is the product of digits");
	}
}
