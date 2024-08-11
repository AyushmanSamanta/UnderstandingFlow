/* WAP to print prime numbers between a given range */

import java.util.Scanner;
class RangePrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n = sc.nextInt();
		
		int i;
		int j;
		int count = 0;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
			if(i % j == 0){
				count ++;
				}
			}
			if(count == 2){
				System.out.println(i+" are the prime numbers.");
				}
			}
		}
}


