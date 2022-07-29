package assingment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findlead  extends baseClass   {
	@BeforeTest
	public void setExcel() {
		fileName="findLead";

	}
	@Test(dataProvider="fetchName")
public void FindLead(String fName, String lName, String cName) {
	
	//Find Leads
		System.out.println("find");
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fName);
	driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lName);
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(cName);
	driver.findElement(By.className("x-btn-text")).click();
}
}
