import java.util.Scanner;
class Cuboid 
{
	public static void main(String[] args) 
	{
		double frontBack,sides,topBottom,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double l = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		double b = sc.nextDouble();
		System.out.println("Enter the height: ");
		double h = sc.nextDouble();

		frontBack = (l*h);
		System.out.println(" Area of front and back side: "+frontBack);
		sides = (b*h);
		System.out.println(" Area of sides: "+sides);
		topBottom = (l*b);
		System.out.println(" Area of top and bottom: "+topBottom);
		volume = (l*b*h);
		System.out.println(" volume of cuboid: "+volume);

		
	}
}
