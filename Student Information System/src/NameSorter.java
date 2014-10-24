import java.util.Comparator;

public class NameSorter implements Comparator<Students>
	{
	public int compare(Students s1,Students s2)
		{
		return s1.getlastName().compareTo(s2.getlastName());
		}
	}