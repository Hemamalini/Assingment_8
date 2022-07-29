package assingment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Editlead extends baseClass  {
	@BeforeTest
	public void setExcel() {
		fileName="updateLead";

	}
	@Test(dataProvider="fetchName")

	public void editLead(String compyName, String fName, String lName, String localName, String dept, String descp, String mail, String Country,String newCname) {

	System.out.println("edit");
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compyName);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(localName);
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
	driver.findElement(By.id("createLeadForm_description")).sendKeys(descp);
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(mail);
	WebElement StateProvinceGeoIdElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		//StateProvinceGeoIdElement.sendKeys("New York");//or try by creating obj
		Select stateObj = new Select(StateProvinceGeoIdElement);
		stateObj.selectByVisibleText(Country);
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.className("smallSubmit")).click();

		String createTitlePage = driver.getTitle();
		System.out.println("The Title of the page is : "+createTitlePage);

	}
}	
