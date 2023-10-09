package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/prawi/Downloads/checkbox/checkbox.html");
        WebElement png = driver.findElement(By.
        png.click();
        Thread.sleep(3000);
        String sp = png.getText();
        System.out.println(sp);
        Thread.sleep(3000);

	}

}
