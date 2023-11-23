package testNG;
import org.testng.annotations.Test;

public class SkipEg {
	@Test(priority=0)
	public void startCar()
	{
		System.out.println("Car is Started");
	}
	@Test(priority=1)
	public void putFirstGear()
	{
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putSecondGear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority=3,enabled=false)
		public void startMusic() {
	System.out.println("Start Music");
	}
	
	@Test(priority=4)
	public void putThirdGear()
	{
		System.out.println("Third Gear");
	}
	
	
	
}
