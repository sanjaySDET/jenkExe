package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pjct2Test {

	@Test
	public void m2Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}

}
