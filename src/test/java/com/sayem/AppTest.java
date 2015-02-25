package com.sayem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
	public void testApp()
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("before creating the instance");

		// Go to the Google Suggest home page
		driver.get("http://www.google.com/webhp?complete=1&hl=en");
		System.out.println("after creating the instance");
		assertTrue( true );
	}
}
