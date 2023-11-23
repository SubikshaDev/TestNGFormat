package testNG;
import org.testng.annotations.Test;

public class PriorityEg {
	
	
	@Test(priority=1)
	public void hiMuruga()
	{
		System.out.println("Hi Muruga");
	}
	@Test(priority=0)
	public void hiSubiksha()
	{
		System.out.println("hi Subiksha");
	}
	}


