package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
String role="AutomationEngineer";
Boolean value=true;
@Test
public void assertEg()
{
	// Assert.assertEquals(role, "AutomationEngineer");
 //Assert.assertNotEquals(role, "AutomationEngineer");
	// Assert.assertTrue(value,"Role:AutomationEngineer");
	Assert.assertFalse(value,"Role:InternShip");

	}
}
