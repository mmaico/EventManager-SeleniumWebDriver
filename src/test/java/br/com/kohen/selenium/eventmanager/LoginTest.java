package br.com.kohen.selenium.eventmanager;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
private FirefoxDriver driver;
	
	@Before
	public void before() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void enterPage() {
		
		driver.get("http://localhost:8180/view/login");
		
		WebElement login = driver.findElementByName("loggeduser.login");
		login.sendKeys("mmaico");
		
		WebElement password = driver.findElementByName("loggeduser.password");
		
		password.sendKeys("mmaico");
		
		password.submit();
		
		WebElement elementMenu = driver.findElement(By.xpath("//*[@id='my-data']"));
		elementMenu.click();
		
		
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("html body div#container div#header ul#sub_mydata.sub-menu-top li a")));
		
		element.click();
		
		WebElement elementNext = driver.findElement(By.xpath("/html/body/div/div[3]/form/fieldset/div[2]/a"));
		elementNext.click();
		
		elementNext.click();
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='countryEndBusinessMail']")));
		select.selectByIndex(5);
		
		elementNext.click();
		

		
	}
	
	@Test
	public void testItemCategoryCredential() {
		
		
		
		
	}
	
}
