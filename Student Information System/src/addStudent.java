import java.util.Scanner;
import java.util.ArrayList;

public class addStudent
	{
	private static String firstName, lastName, firstPeriod, firstGrade, secondPeriod, secondGrade, thirdPeriod, thirdGrade;
	private static double GPA;
	private static int firstP, secondP;
	private static ArrayList<String> subject = new ArrayList<String>();
	
	public static void addStudent()
		{
		promptAllInput();
		makeStudentJoinClass();
		}
	
	public static void makeStudentJoinClass()
		{
		StudentRoster.getStudent().add(new StudentRoster(firstName, lastName, GPA, firstPeriod, firstGrade, secondPeriod, secondGrade, thirdPeriod, thirdGrade));
		}
	
	public static void promptAllInput()
		{
		subject.add("Biology");
		subject.add("English");
		subject.add("Algebra");
		System.out.println("What is the first name of the new student?");
		Scanner keyboard = new Scanner(System.in);
		firstName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the last name of the new student?");
		lastName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the GPA of the new student?");
		GPA = keyboard.nextDouble();
		System.out.println();
		System.out.println("What 1st period is the new student in?");
		System.out.println();
		System.out.println("Your options are:");
		for(int i = 0; i < subject.size(); i++)
			{
			System.out.println("	" + (i + 1) + ") " + subject.get(i));
			}
		firstP = keyboard.nextInt();
		firstPeriod = subject.get(firstP - 1);
		System.out.println(firstPeriod);
		}
	
	public static void deadEnd()
		{
		System.out.println("Please restart the program.");
		}
	}