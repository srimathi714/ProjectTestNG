package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebElement pop = driver.findElement(By.linkText("Alert with OK"));
        pop.click();
        WebElement popone = driver.findElement(By.xpath("//*[@id=\'OKTab\']/button"));
        popone.click();
        Alert nxtwindow = driver.switchTo().alert();
        Thread.sleep(1000);
        nxtwindow.accept();
        WebElement tap = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        tap.click();
        WebElement tell = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
        tell.click();
        Alert show = driver.switchTo().alert();
        show.accept();
        WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
        next.click();
        WebElement all = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
        all.click();
        Alert box = driver.switchTo().alert();
        box.sendKeys("seen");
        Thread.sleep(5000);
        box.accept();
        //Thread.sleep(5000);
                
        }

}
