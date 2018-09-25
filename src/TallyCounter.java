/**
 * 
 * @author Marc Lussier, Period 7
 *
 */
public class TallyCounter
{
	// Instance Variables
	
	private int count;
	
	
	// Constructor
	
	public TallyCounter()
	{
		count = 0;
		
	}
	
	public TallyCounter(int startNum)
	{
		count = startNum;
		
	}

	public void click()
	{
		count = count + 1;
		//count++; shortcut for count=count+1
		//count+=1; shortcut for count=count+1, but can say multiple instead of just "1".
	}
}
