package Taskgiven.Amazon;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.baseClass;

public class Draganddrop extends baseClass {
	@BeforeTest
	public void initialisedriver() throws IOException
	{
		driver=selectDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
@Test
	public void dragdrop() {
		// TODO Auto-generated method stub

		
		
	   WebElement src=driver.findElement(By.xpath("//*[@id=\"treebox1\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
	   WebElement dstc=driver.findElement(By.xpath("//*[@id=\"treebox2\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
	   
	   Actions action=new Actions(driver);
			  action.dragAndDrop(src, dstc).build().perform();
			  
	  
			   }


}
