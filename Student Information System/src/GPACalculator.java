

public class GPACalculator
{
	static String convert; 
	static double number; 
	public static void GPA() 
	{
		for(int i = 0; i < Students.studentRoster.size();i++) 
		{
			convert = Students.studentRoster.get(i).getPeriod1Grade();
			grade();
			convert = Students.studentRoster.get(i).getPeriod2Grade(); 
			grade(); 
			convert = Students.studentRoster.get(i).getPeriod3Grade(); 
			grade(); 
		}
	}
	public static void grade() 
	{
		switch(convert) 
		{
			case "A+": 
			{
				number = number + 4.3; 
				break; 
			}
			case "A": 
			{
				number = number + 4.0; 
				break; 
			}
			case "A-": 
			{
				number = number + 3.7;
				break; 
			}
			case "B+": 
			{
				number = number + 3.3;
				break; 
			}
			case "B": 
			{
				number = number + 3.0; 
				break; 
			}
			case "B-": 
			{
				number = number + 2.7;
				break; 
			}
			case "C+": 
			{
				number = number + 2.3;
				break; 
			}
			case "C":
			{
				number = number + 2.0;
			}
			case "C-": 
			{
				number = number + 1.7;
				break; 
			}
			case "D+": 
			{
				number = number + 1.3; 
				break; 
			}
			case "D": 
			{
				number = number + 1.0;
				break; 
			}
			case "D-": 
			{
				number = number + 0.7;
				break; 
			}
			case "F":
			{
				number = number + 0.0;
		}
		}
	}
}

