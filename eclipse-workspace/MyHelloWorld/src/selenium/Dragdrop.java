package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:/Users/prawi/Downloads/mouse.html");
		WebElement clickable = driver.findElement(By.id("clickable"));
		
		Actions obja = new Actions(driver);
		
		obja.clickAndHold(clickable);
		obja.perform();
		Thread.sleep(2000);
		
		obja.click(clickable);
		obja.perform();
		Thread.sleep(2000);
		
		obja.contextClick(clickable);
		obja.perform();
		Thread.sleep(2000);
		
		obja.doubleClick(clickable);
		obja.perform();
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		obja.dragAndDrop(drag, drop);
		obja.perform();
		
		WebElement hov = driver.findElement(By.id("hover"));
		obja.moveToElement(hov);
		obja.perform();
		Thread.sleep(2000);
		
		WebElement mouse = driver.findElement(By.id("mouse-tracker"));
		obja.click(mouse);
		obja.perform();
		Thread.sleep(2000);
		

	}

}
