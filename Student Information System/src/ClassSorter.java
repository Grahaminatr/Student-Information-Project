import java.util.Comparator

public class ClassSorter {

	public int compare(Students s1, Students s2)
	{
	if (studentRoster.periodToSort == 1)
		{
		return s1.getperiod1().getClassName().compareTo(s2.getperiod1().getClassName());
		}
	else if (studentRoster.periodToSort == 2)
		{
		return s1.getperiod2().getClassName().compareTo(s2.getperiod2().getClassName());
		}
	else if (studentRoster.periodToSort == 3)
		{
		return s1.getperiod3().getClassName().compareTo(s2.getperiod3().getClassName());
		}
	else 
		{
		return 0;
		}
	}
}