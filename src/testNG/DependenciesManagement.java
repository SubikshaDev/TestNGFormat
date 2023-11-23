package testNG;
import org.testng.annotations.Test;

public class DependenciesManagement {
//@Test(enabled=false)
	@Test
	public void highSchool()
	{
		System.out.println("High School : COMPLETED");
	}
@Test(dependsOnMethods="highSchool")
	public void higherSecondarySchool()
	{
		System.out.println("Higher Secondary School: COMPlETED");
	}
@Test(dependsOnMethods="higherSecondarySchool")
	public void engineeringCollege()
	{
		System.out.println("Engineering College : JOINED");
	}
}
