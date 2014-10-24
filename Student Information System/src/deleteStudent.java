
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class deleteStudent {

	public static void RemoveStudent() throws IOException
	{
		
		int counter = 1;
		System.out.println("Which student would you like to remove?");
		for(int i = 0; i < studentRoster.size(); i++)
			{
			System.out.println(counter + "). " + studentRoster.get(i).getFirstName() + " " + studentRoster.get(i).getLastName());
			counter++;
			}
		Scanner userInput1 = new Scanner(System.in);
		studentRoster.remove(userInput1);
		}
}