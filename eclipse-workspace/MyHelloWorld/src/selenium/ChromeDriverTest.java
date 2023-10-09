package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Chennai"+Keys.ENTER);
		//driver.findElement(By.linkText("Maps")).click();
		 //driver.findElement(By.xpath("//*[@id=\'APjFqb\']")).sendKeys("fita"+Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("porur"+Keys.ENTER);
		
	}
}
