package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/span[2]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles"+Keys.ENTER);
        //driver.findElement(By.linkText("mobiles")).click();
		//all.click();
		WebElement ss = driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[1]"));
		ss.click();
		WebElement qq = driver.findElement(By.className("a-price-whole"));
		String aa = qq.getText();
		System.out.println(aa);

        		
		}
}


