package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Html {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.html-code-generator.com/html/drop-down/country-names");
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'condi\']"));
        Select objSelect = new Select(dropdown);
        objSelect.selectByIndex(4);
        Thread.sleep(3000);
        objSelect.selectByValue("SA");
        Thread.sleep(3000);
        objSelect.selectByVisibleText("Asia");
        List <WebElement> s = objSelect.getOptions();
        int size = s.size();
        System.out.println(size);
        driver.close();
        //Thread.sleep(3000);
        
	}

}