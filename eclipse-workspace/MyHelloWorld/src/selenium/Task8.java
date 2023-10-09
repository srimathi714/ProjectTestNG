package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/prawi/Downloads/checkbox/checkbox.html");
        WebElement seen = driver.findElement(By.xpath("/html/body/label[1]/span"));
        seen.click();
        WebElement one  = driver.findElement(By.xpath("/html/body/label[2]/span"));
        one.click();
        WebElement sec = driver.findElement(By.xpath("/html/body/label[3]/span"));
        sec.click();
        WebElement sit = driver.findElement(By.xpath("/html/body/label[4]/span"));
        sit.click();
         
        
        
        
        
        
	}

}
