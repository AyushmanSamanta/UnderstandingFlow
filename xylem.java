class Xylem 
{
	public static void main(String[] args) 
	{
		int num = 2334;
int rem =0;
int rem2=0;
int rev = 0;
int firstnum = 0;
int sum =0;
int y = 0 ;
		int lastnum= num % 10;
         int x=num%10;

		while(x > 0)
		{
			rem=x%10;;
			rev=(rev*10+rem);
			x=x/10;

		}
		firstnum=rev%10;
		y =rev/10;
		while (y>=0)
		{
			rem2 =y%10;
			sum= sum+rem;
			y=y/10;
		}
         int a=firstnum+lastnum;
		if (a==sum)
		{
			System.out.println("Xylem");
		}
		else {
			System.out.println("not Xylem");
		}
			}
}
