// WAP to print the below pattern:

/*               *
		       * *	 
		     * * *
		   * * * *
		 * * * * *
*/

class Pattern3 
{
	public static void main(String[] args) 
	{
		int n = 5;

		for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					{
						if(i+j>=n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" "); //extra space
						}
					}
				System.out.println(" ");
					
			}
	}
}
