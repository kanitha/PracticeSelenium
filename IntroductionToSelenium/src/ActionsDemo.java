import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Installers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/fake-landing-page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Actions mouse = new Actions(driver);
//		WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(3));
//		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.et_pb_menu__icon.et_pb_menu__search-button")));
//		
//		Fluent wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(6))
//								.pollingEvery(Duration.ofSeconds(5))
//								.ignoring(NoSuchElementException.class);
//		
//		WebElement search = wait.until(new Function<WebDriver, WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				if(driver.findElement(By.cssSelector("button.et_pb_menu__icon.et_pb_menu__search-button")).isDisplayed()) {
//					return driver.findElement(By.cssSelector("button.et_pb_menu__icon.et_pb_menu__search-button"));
//				}
//				return null;
//			}
//		});
		
		mouse.pause(3000).moveToElement(driver.findElement(By.cssSelector("button.et_pb_menu__icon.et_pb_menu__search-button"))).click().build().perform();
		mouse.moveToElement(driver.findElement(By.xpath("//input[@type='search']"))).keyDown(Keys.SHIFT).sendKeys("product").doubleClick().build().perform();

		mouse.pause(3000).moveToElement(driver.findElement(By.xpath("//a[text()='View Courses']"))).contextClick().build().perform();
		//driver.close();
	}

}
