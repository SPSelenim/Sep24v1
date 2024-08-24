package pomSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomSearch1 {

	public WebDriver driver = null;
	public String start = "fname";
	public String end = "lname";
	public String job = "//a[@name='Development']";

	public pomSearch1(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirst() {
		WebElement first = null;
		try {
			first = driver.findElement(By.id(start));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return first;
	}

	public WebElement getLast() {
		WebElement last = null;
		try {
			last = driver.findElement(By.id(end));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return last;
	}

	public WebElement getDevelopment() {
		WebElement development = null;
		try {
			development = driver.findElement(By.xpath(job));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return development;
	}

	public void EnterFirst(String myFirst) {
		try {
			getFirst().sendKeys(myFirst);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void EnterLast(String myLast) {
		try {
			getLast().sendKeys(myLast);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ClickonDevelopment() {
		try {
			getDevelopment().click();
			System.out.println("CLICKED-------------------------------------------");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
