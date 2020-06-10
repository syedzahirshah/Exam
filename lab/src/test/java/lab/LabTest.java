package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabTest{
	
	
	
	@Test
	public void TestCase1()
	{
		assertEquals(-1 ,  Lab.fahrenheitToCentigrade(30));
	}
	
	@Test
	public void TestCase2()
	{
		assertEquals(140 ,  Lab.centigradeToFahrenheit(60));
	}
	
	@Test
	public void TestCase3()
	{
		assertEquals("hello" ,  Lab.removeSignOfExclaimation("hello!"));
	}
	
	@Test
	public void TestCase4()
	{
		assertEquals(10 ,  Lab.getCurrentDay());
	}
	
	@Test
	public void TestCase5()
	{
		assertEquals(6 ,  Lab.getCurrentMonth());
	}
	
	@Test
	public void TestCase6()
	{
		assertEquals(2020 ,  Lab.getCurrentYear());
	}
	
}