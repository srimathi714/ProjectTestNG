package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?&adgrpid=57696023943&ext_vrnc=hi&hvadid=617724336202&hvdev=c&hvlocphy=9061917&hvnetw=g&hvqmt=b&hvrand=17207952249006221980&hvtargid=kwd-300311771511&hydadcr=15416_2322994&tag=googinhydr1-21&ref=pd_sl_9ff0d1q2jb_b");
		//driver.findElement(By.id("APjFqb")).sendKeys("Amazon registration"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div[1]/div/a/h3")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("umbrella best seller tag"+Keys.ENTER);
        //driver.findElement(By.linkText("Today's Deals")).click();
        //driver.findElement(By.linkText("All Deals")).click();
		//driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[26]/div/div/div/div/div/div/div[3]/div[2]/h2/a/span[1]")).click();
          driver.findElement(By.linkText("All")).click();
          driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[1]/li[3]/a")).click();
          driver.findElement(By.xpath("//*[@id=\"navSwmHoliday\"]/a")).click();
          driver.findElement(By.linkText("Mobiles & Accessories")).click();
		 

	}

}
