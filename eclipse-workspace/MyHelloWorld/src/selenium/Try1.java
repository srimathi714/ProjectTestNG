package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\prawi\\OneDrive\\Desktop\\radio.html");
        List<WebElement> radiobox = driver.findElements(By.name("group1"));
        int a = radiobox.size();
        System.out.println(a);
        for(int i=0;i<a;i++)
        {
        Thread.sleep(3000);
        radiobox.get(i).click();
        Thread.sleep(3000);
        List<WebElement> one = driver.findElements(By.name("group2"));
		int b = one.size();
		System.out.println(b);
		for(int j=0;j<b;j++)
		{
	    Thread.sleep(2000);
	    one.get(j).click();
	    Thread.sleep(2000);

	}

}
}
}
