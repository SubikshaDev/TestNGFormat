package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEg {
	@Test
	@Parameters("role")
	public void data(String JobRole)
	{
		System.out.println("Role :"+ JobRole);
	}
}
