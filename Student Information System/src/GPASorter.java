
import java.util.Comparator;

public class GPASorter implements Comparator<Students> 
{
	public int compare(Students s1, Students s2)  
	{
		if(s1.getGPA() < s2.getGPA()) 
		{
			return 1;
		}
		else 
		{
			return -1; 
		}
	}
}
	
