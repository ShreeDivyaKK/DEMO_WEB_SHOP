package com.demowebshop.automation.generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case Pass"+" "+result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed"+" "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Failed"+" "+result.getName());	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Test Case Failed"+" "+result.getName());
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test Case Failed"+" "+result.getName());
	}

}
