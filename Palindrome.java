/* Program to print the Palindrome of a number */

import java.util.Scanner;
class Palindrome
 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int var =0;
		int temp = num;
		int rem = 0;

		while(num>0)
		{
			rem = num % 10;
			var = (var*10)+rem;
			num=num/10;
		}
		if(var == temp){
			System.out.println("It is a palindrome.");
		}
		else{
			System.out.println("It is not a palindrome.");
		}
	}
}
