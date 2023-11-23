package testNG;

import org.testng.annotations.Test;

public class GroupsEg {
	@Test(groups= {"Tamil"})
	public void tamilPaper1()
	{
		System.out.println("Tamil Paper--1");
	}
	@Test(groups= {"Tamil"})
	public void tamilPaper2()
	{
		System.out.println("Tamil Paper--2");
	
	}
	@Test(groups= {"Testing"})
	public void softwareTesting()
	{
		System.out.println("Manual Testing");
	}
	@Test(groups= {"Testing"})
	public void softwareTestingAdvanced()
	{
		System.out.println("Automation Testing");
	}
	@Test(groups= {"Maths"})
	public void mathsPaper1()
	{
		System.out.println("Maths Paper--1");
	}
	@Test(groups= {"Maths"})
	public void mathsPaper2()
	{
		System.out.println("Maths Paper--2");
	}

}
