package review;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	public WebDriver driver;
	
	
	@BeforeTest
	
	public void home_page() {

//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		driver.get("https://www.youtube.com/");
		
//           WebDriver driver = new EdgeDriver();	
           this.driver = new EdgeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.google.com/maps/");
	
}



@Test()
public void open() throws InterruptedException {
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys("taj mall");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[1]/button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).sendKeys("عبود الاسمر");
	driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).sendKeys(Keys.ENTER);
	
	
	
	
}
}