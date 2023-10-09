package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/prawi/Downloads/checkbox/checkbox.html");
        WebElement checkbox1 = driver.findElement(By.xpath("/html/body/label[1]/span"));
        WebElement checkbox2 = driver.findElement(By.xpath("/html/body/label[2]/span"));
        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/label[3]/span"));
        WebElement checkbox4 = driver.findElement(By.xpath("/html/body/label[4]/span"));
        
        boolean thirdbox = checkbox3.isSelected();
        
        if(thirdbox)
        {
        	System.out.println(thirdbox);
        }
        else {
        	System.out.println(thirdbox);
        }
        Thread.sleep(3000);
        checkbox3.click();
        
        WebElement selectallbutton = driver.findElement(By.xpath("/html/body/button[1]"));
        selectallbutton.click();
        Thread.sleep(3000);
        String allbutton=selectallbutton.getText();
        System.out.println(allbutton);
        Thread.sleep(2000);
        if(allbutton=="Select All") 
        {
        	checkbox1.click();
        	Thread.sleep(2000);
        	checkbox2.click();
        	Thread.sleep(2000);
        	checkbox3.click();
        	Thread.sleep(3000);
        	checkbox4.click();
        	Thread.sleep(3000);
        }
        else
        {
        	System.out.println("allbutton not available");
        }
	}
}
        
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	

        
        
        
        	
        	
        
        //WebElement clearall = driver.findElement(By.xpath("/html/body/button[2]"));
        //clearall.click();
        //Thread.sleep(2000);
        //String test = clearall.getText();
        //System.out.println(test);
        //Thread.sleep(2000);
	

        
        
        
                
        





