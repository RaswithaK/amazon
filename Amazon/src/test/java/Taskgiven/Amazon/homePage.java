package Taskgiven.Amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.baseClass;
import pageobjects.landingpage;
import pageobjects.loginpage;

public class homePage extends baseClass {
	@BeforeTest
	public void diveropen() throws IOException
	{
		driver=selectDriver();
		
		;
	}
@Test(dataProvider="getData")
public void basepagenavigation( String username,String password) throws IOException
{
	
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	landingpage l=new landingpage(driver);
	
	
	l.Title().getText();
	l.Signin().click();
	
	
	loginpage in=new loginpage(driver);
	in.Email().sendKeys(username);;
	in.Password().sendKeys(password);
	in.Login().click();
	in.Email().clear();
	
}
@DataProvider
public Object[][] getData()
{
	//row stand for how many different data types tests should
	//column stands for how many values for each test
	Object[][] data=new Object[2][2];
	data[0][0]="nonrestricteduser@go.com";
			data[0][1]="123456";
			data[1][0]="restricteduser@go.com";
			data[1][1]="456789";		
	return data;
}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}
