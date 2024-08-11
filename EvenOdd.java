import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//System.out.println("Enter a number: ");
		//int x = sc.nextInt();

		System.out.println("Enter the range: ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
				
			if(i % 4 == 2)
				{
					System.out.println(i);
				}
			/*else
				{
					System.out.println(i+" It's Odd");
				} */
		}
	}
}

