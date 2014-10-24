import java.util.*;

public class ChangeGrade
	{
	private static int counter=0;
	private static int chooseStudent=0;
	private static int fillerInt=0;
	
	public static void changeGrade()
		{
		System.out.println("Here are the names of the students, which one would you like to change?");
		Collections.sort(Students.studentRoster, new NameSorter());
		for (int i = 0; i < Students.studentRoster.size(); i++)
			{
			counter++;
			System.out.println(counter + ")"+ " "+ Students.studentRoster.get(i).getFirstName()+ " "+ Students.studentRoster.get(i).getLastName());
			}
		Scanner userInput1 = new Scanner(System.in);
		chooseStudent = userInput1.nextInt();
		fillerInt = chooseStudent - 1;
		System.out.println("\n" + "Here are the classes and scores of "+ Students.studentRoster.get(fillerInt).getFirstName()+ " "+ Students.studentRoster.get(fillerInt).getLastName() 
		+ ".");System.out.println("\n"+ Students.studentRoster.get(fillerInt).getPeriod1()+ " "+ Students.studentRoster.get(fillerInt)
				.getPeriod1Grade()+ " "+ Students.studentRoster.get(fillerInt).getPeriod2()+ " "+ Students.studentRoster.get(fillerInt)
				.getPeriod2Grade()+ " "+ Students.studentRoster.get(fillerInt).getPeriod3()+ " "+ Students.studentRoster.get(fillerInt)
				.getPeriod3Grade());
		}
	}