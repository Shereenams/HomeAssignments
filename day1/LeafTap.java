package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	//To maximize
		driver.get("http://leaftaps.com/opentaps/control/main"); //Load the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //wait30s to load
		driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Shereena");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTab");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close(); //close the browser
	}

}
