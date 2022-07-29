package assingment8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead extends baseClass {
	@BeforeTest
	public void setExcel() {
		fileName="mergeLead";

	}
	@Test(dataProvider="fetchName")
	public void mergeLead(String fromLead, String toLead) {
		//Merge Leads
		System.out.println("merge");
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys(fromLead);
		driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys(toLead);
		driver.findElement(By.linkText("Merge")).click();
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
	}
}
