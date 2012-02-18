package br.com.kohen.selenium.eventmanager;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
private FirefoxDriver driver;
	
	@Before
	public void before() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void enterPage() {
		
		driver.get("http://184.72.134.147/view/login");
		
		WebElement login = driver.findElementByName("loggeduser.login");
		login.sendKeys("maria.teste");
		
		WebElement password = driver.findElementByName("loggeduser.password");
		password.sendKeys("maria.teste");
		
		password.submit();
		
		WebElement requiredCategory = driver.findElementById("required_category");
		requiredCategory.click();
		
//		WebElement element = driver.findElementById("sidebar-left");
//		WebElement ulCategory = element.findElement(By.xpath("ul"));
//		List<WebElement> findElements = ulCategory.findElements(By.xpath("li"));
//		
//		for (WebElement webElement : findElements) {
//			WebElement tagA = webElement.findElement(By.xpath("a"));
//			
//			if (tagA.getText().equalsIgnoreCase("Credenciais")) {
//				
//				tagA.click();
//			}
//		}
//		System.out.println(findElements.size());
		
//		List<WebElement> list = element.findElements(By.xpath("li"));
		
		
		
		
		WebElement productContainer = driver.findElementByClassName("list-products");
		
		List<WebElement> elements = productContainer.findElements(By.xpath("li"));
		
		Assert.assertTrue(elements.size()  == 3);
		
	}
	
	@Test
	public void testItemCategoryCredential() {
		
		
		
		
	}
	
}
