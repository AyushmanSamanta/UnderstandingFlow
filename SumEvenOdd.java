import java.util.Scanner;
class SumEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int sumEven = 0;
		int sumOdd = 0;

		System.out.println("Enter the range: ");
		int n = sc.nextInt();

		for(int i=0;i<=n;i++)
		{
			if(i % 2 == 0)
				{
					//System.out.println(i);
					sumEven = sumEven + i;
					System.out.println("The sum of Even is "+sumEven);
					//System.out.println("It's Even");
				}
			else
				{
					//System.out.println(i);
					sumOdd = sumOdd + i;
					System.out.println("The sum of Odd is "+sumOdd);
					//System.out.println("It's Odd");
				}
		}
	}
}

