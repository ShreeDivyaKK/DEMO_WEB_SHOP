package com.demowebshop.automation.generic;

public class GenericDataTypeConverter 
{
	public static double convertIntoDouble(String data)
	{
		double doubleConverted = Double.parseDouble(data);
		return doubleConverted;
	}
	public static Object convertIntoInteger(String data)
	{
		Object integerConverted = Integer.parseInt(data);
		return integerConverted;
	}
}
