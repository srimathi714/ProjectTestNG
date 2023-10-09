package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/prawi/Downloads/checkbox/checkbox.html");
		List<WebElement> set1 = driver.findElements(By.xpath("/html/body/img[1]"));
		List<WebElement> set2 = driver.findElements(By.xpath("/html/body/img[2]"));
		List<WebElement> set3 = driver.findElements(By.xpath("/html/body/img[3]"));
		List<WebElement> set4 = driver.findElements(By.xpath("/html/body/img[4]"));
		List<WebElement> set5 = driver.findElements(By.xpath("/html/body/img[5]"));
		int c = set.size();
		System.out.println(c);
		for(int j=0;j<c;j++)
		{
	    Thread.sleep(2000);
	    set.get(j).click();
	    Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
