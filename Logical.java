import java.util.Scanner;

public class Logical{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game !! Please press q or Q to quit.");
		String response = scanner.next();

	/*	if(response.equals("q") || response.equals("Q")){
			System.out.println("You quit the Game!!!!");
		}
		else{
			System.out.println("You are still playing the game!!!");
		}     */
		
		
		if(!response.equals("q") && !response.equals("Q")){
			System.out.println("You are still playing the game!!!!");
		}
		else{
			System.out.println("You quit the game!!!");
		}
	}
}