package Taskgiven.Amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.baseClass;
import pageobjects.landingpage;

public class validateTitle extends baseClass{
	@BeforeTest
	public void diveropen() throws IOException
	{
		driver=selectDriver();
		
	}
@Test
public void basepagenavigation(){
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	landingpage l=new landingpage(driver);

	
	
	Assert.assertEquals(l.Title().getText(), "FEATURED COURSES");
	Assert.assertTrue(l.getnavbar().isDisplayed());
	
	
	
}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}

}

