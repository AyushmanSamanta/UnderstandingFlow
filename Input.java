import java.util.Scanner;

public class Input{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name???");
		String name = scanner.nextLine();

		System.out.println("What is your age???");
		int age = scanner.nextInt();

		scanner.nextLine();

		System.out.println("What's your favourite food????");
		String food = scanner.nextLine();

		System.out.println("Hello "+name);
		System.out.println("I am "+age+" years old");
		System.out.println("I like "+food);
	}
}
