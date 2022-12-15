package stepDif;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public WebDriver driver;
	@Given("opening browser")
	public void opening_browser() throws InterruptedException {
	   System.out.println("Hello browser");
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   Thread.sleep(2000);
	}

	@When("Enter value into textbox")
	public void enter_value_into_textbox() {
	  System.out.println("Enter value into textbox");
	  driver.findElement(By.name("q")).sendKeys("qualitrix");
	}

	@Then("click on searchbox")
	public void click_on_searchbox() {
	  System.out.println("click searchbox");
	  driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	  driver.quit();
	}


}
