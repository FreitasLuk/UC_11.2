package teste2senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeSite {
	private WebDriver driver;
	
	@Before
	public void abrirNavergador() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void testeNavegador() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("brainly");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("hdtb-tls")).click();
		
	}
	
}
