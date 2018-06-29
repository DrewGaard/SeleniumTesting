package test;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class SearchBarTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/Drew/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Instantiate a new WebDriver Objects
		
		driver.manage().window().maximize(); // Maximize the window
		
		driver.get("http://www.amazon.com/"); // Navigate to amazon.com
		
		
		WebElement searchBar = driver.findElement(By.name("site-search")); // Get the search bar element
		
		System.out.println(searchBar.getTagName()); // test to make sure the right element was found
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(searchBar); // focus on the seachBar element
		actions.click(); // click inside the search form
		actions.sendKeys("bike"); // enter the word "bike" into the form

		actions.sendKeys(Keys.ENTER).perform(); // press the enter key to initiate the search
	
		actions.release().perform();

		
		// Close the browser
		//driver.close(); 
		
	}

}