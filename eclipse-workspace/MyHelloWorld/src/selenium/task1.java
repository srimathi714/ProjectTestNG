package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prawi\\OneDrive\\Documents\\Applications\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");
	WebElement txtbox = driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']"));
	String val = txtbox.getAttribute("placeholder");
    System.out.println(val);
    boolean checkstatus = txtbox.isEnabled();
    System.out.println(checkstatus);
    Point abposition = txtbox.getLocation();
    System.out.println(abposition);
	txtbox.sendKeys("fita porur");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']")).clear();
	driver.findElement(By.id("ap_email")).sendKeys("srimathikrishnamoorthi@gmail.com");
	driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("123");
	driver.findElement(By.xpath("//*[@id=\'ap_password_check\']")).sendKeys("fita ");
	driver.findElement(By.xpath("//*[@id=\'continue\']")).click();


	}

}
