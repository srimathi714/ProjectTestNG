package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		//WebElement web = driver.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr[3]/td[4]")); 
		//web.click();
		//Thread.sleep(2000);
		//String sit = web.getText();
		//System.out.println(sit);
		List<WebElement> sq = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]"));
		int s = sq.size();
		System.out.println(s);
		for(int i=0;i<s;i++)
		{
		Thread.sleep(2000);
		sq.get(i).click();
		Thread.sleep(2000);
		
		}
		

		
		

	}

}
