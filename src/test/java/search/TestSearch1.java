package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomSearch.pomSearch1;

public class TestSearch1 {
	public WebDriver driver = null;

	@BeforeSuite
	public void tearUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}

	@Test
	public void f() {
		try {
			driver.manage().window().maximize();
			pomSearch1 search1 = new pomSearch1(driver);
			search1.EnterFirst("SSSS");
			search1.EnterLast("OOOO");
			search1.ClickonDevelopment();
			String strActual = driver.findElement(By.xpath("//b")).getText();
			Assert.assertEquals(strActual, "Hello Developement");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
