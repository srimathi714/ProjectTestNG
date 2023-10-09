package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/prawi/OneDrive/Desktop/All%20Countries%20Drop%20Down%20List%20_%20HTML%20Select%20Country%20Name.html");
        driver.manage().window().maximize();
        WebElement dropd = driver.findElement(By.xpath("//*[@id=\"condi\"]"));
        Select mltselect = new Select(dropd);
        Boolean tellme = mltselect.isMultiple();
        System.out.println(tellme);
        Thread.sleep(3000);
        if(tellme) {
        mltselect.selectByValue("SA");
        Thread.sleep(2000);
        mltselect.selectByValue("EU");
        Thread.sleep(2000);
        }
        else
        {
        mltselect.selectByValue("AS");
        }
        //driver.close();


	}

}
