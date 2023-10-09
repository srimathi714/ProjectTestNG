package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.html-code-generator.com/html/drop-down/country-names");
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'condi\']"));
        WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\'lang\']"));
        //WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'condi\']"));
        Select objSelect = new Select(dropdown);
        Select oSelect = new Select(dropdown1);
        objSelect.selectByIndex(5);
        Thread.sleep(3000);
        oSelect.selectByIndex(7);
        Thread.sleep(4000);
        List <WebElement> a = objSelect.getOptions();
        int size = a.size();
        System.out.println(size);
        driver.close();

	}

}
