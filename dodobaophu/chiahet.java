

public class chiahet {
	boolean KiemTraChiaHet6(int num)
	{
		if (KiemTraChiaHet2(num) && KiemTraChiaHet3(num))
			return true;
		
		return false;
	}
	
	boolean KiemTraChiaHet2(int num)
	{
		if ((num % 2) != 0)
			return false;
		return true;
	}
	
	boolean KiemTraChiaHet3(int num)
	{
		if ((num % 3) != 0)
			return false;
		return true;
	}
	
}
