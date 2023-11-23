package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener{
	

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("TestCase Execution Started");
	}
@Override
public void onFinish(ITestContext context)
{
	System.out.println("TestCase Execution Finished");
		
}
@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("TestCase--->Passed");
	
}
@Override
public void onTestFailure(ITestResult result)
{
	System.out.println("TestCase--->Failed");
	
}
@Override
public void onTestSkipped(ITestResult result)
{
	System.out.println("TestCase--->Skipped");
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
	System.out.println("TestCase--->Failed,But,Within Success% ");
	
}
}
