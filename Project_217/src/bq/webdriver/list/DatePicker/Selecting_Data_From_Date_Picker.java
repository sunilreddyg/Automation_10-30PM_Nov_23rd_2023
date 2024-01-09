package bq.webdriver.list.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Data_From_Date_Picker {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("datepicker")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("18")).click();
	Thread.sleep(5000);
	
	
	/*
	 * If Datepicker editbox is in editable format
	 * so that we can type required date
	 */
	driver.findElement(By.id("datepicker")).clear();
	driver.findElement(By.id("datepicker")).sendKeys("06/25/2024"+Keys.ESCAPE);
	
	
	}

}
