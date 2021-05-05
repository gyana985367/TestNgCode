package azureTesting;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BajajAllianzFutureGainPremiumQuote {

	private WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\carina-startup\\lib\\ChromeDriver.exe");
		System.out.println("Test Case Future Gain with Thread Id:- "
				+ Thread.currentThread().getId());
		
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver(options);
				options.addArguments("--disable-notifications");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get ("https://www.bajajallianzlife.com");
				Thread.sleep(20000);
			
	}
	@Test(priority=1)
	public void Homepage() throws Exception { 
		Thread.sleep(20000);
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[1]/a"));
		actions.moveToElement(menuOption).perform();
		System.out.println("Mouseover on plan");
		Thread.sleep(1000);
		WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[1]/ul/li/div/ul/li[2]/a")); 
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Mouseover on ULIP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[1]/ul/li/div/ul/li[2]/ul/li[3]/a")).click();
		System.out.println("Click on FutureGain");
		Thread.sleep(50000);
		JavascriptExecutor js20 = (JavascriptExecutor) driver;
		WebElement Element19 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div/section[1]/div[2]/div/div/div[3]/div[2]/a"));
		js20.executeScript("arguments[0].click();",Element19);
		System.out.println("Click on Investnow");
		Thread.sleep(15000);
	}
	@Test(priority=2)
	public void FutureGainPage() throws Exception { 
		/*Dimension d = new Dimension(420,600);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		driver.manage().window().setPosition(new Point(1000,0));*/
		driver.findElement(By.xpath("//*[@id=\"personalInformation\"]/div/div[2]/form/div[1]/div[1]/div/input")).sendKeys("TEST");
		System.out.println("Fullname is entered");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"personalInformation\"]/div/div[2]/form/div[1]/div[2]/div/div/p[2]/label/img")).click();
		System.out.println("Gender is entered");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='selfdob']")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[82]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click();
		System.out.println("Date of Birth is entered");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"personalInformation\"]/div/div[2]/form/div[1]/div[4]/div/input")).sendKeys("9899999999");
		System.out.println("Mobile no is entered");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"personalInformation\"]/div/div[2]/form/div[1]/div[5]/div/input")).sendKeys("abc@gmail.com");
		System.out.println("Email id is entered");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"personalInformation\"]/div/div[2]/form/div[1]/div[6]/div/input")).sendKeys("400701");
		System.out.println("Pincode is entered");
		Thread.sleep(15000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement Element2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/button"));
		js3.executeScript("arguments[0].click();",Element2);
		System.out.println("Click on submit button");
		Thread.sleep(25000);
	}
	@Test(priority=3)
	public void Calculation() throws Exception { 
		Thread.sleep(50000);
		JavascriptExecutor js39 = (JavascriptExecutor) driver;
		WebElement Element38 = driver.findElement(By.id("muliplier"));
		js39.executeScript("arguments[0].click();",Element38);	
		System.out.println("Click on Premium paid");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"muliplier\"]/option[6]")).click();
		System.out.println("Enter in 6th option");
		Thread.sleep(1000);
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		WebElement Element11 = driver.findElement(By.xpath("//*[@id=\"investmentPreferences\"]/div[3]/div[1]/div/div/div/p[1]/label"));
		js12.executeScript("arguments[0].click();",Element11);
		System.out.println("Click on wheel of life button button");
		Thread.sleep(1500);
		JavascriptExecutor js19 = (JavascriptExecutor) driver;
		js19.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("page is scrolled");
		Thread.sleep(10000);
		JavascriptExecutor js16 = (JavascriptExecutor) driver;
		WebElement Element15 = driver.findElement(By.xpath("//*[@id=\"investmentPreferences\"]/div[8]/button"));
		js16.executeScript("arguments[0].click();",Element15);
		System.out.println("Click on Proceed2 button");
		Thread.sleep(50000);
		JavascriptExecutor js29 = (JavascriptExecutor) driver;
		js29.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("page is scrolled");
		Thread.sleep(35000);
		JavascriptExecutor js36 = (JavascriptExecutor) driver;
		WebElement Element35 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[7]/a[2]/button"));
		js36.executeScript("arguments[0].click();",Element35);
		System.out.println("Click on Download illustration button");
		Thread.sleep(25000);

		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();

			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
			}
		}
		//switch to the parent window
		driver.switchTo().window(parent);
		Thread.sleep(25000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[5]/p[1]/span[1]/input"));
		js1.executeScript("arguments[0].click();",Element);
		System.out.println("Click on agree button");
		Thread.sleep(1000);
		JavascriptExecutor js56 = (JavascriptExecutor) driver;
		WebElement Element55 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[7]/a[3]"));
		js56.executeScript("arguments[0].click();",Element55);
		System.out.println("Click on confirm & pay button");
		Thread.sleep(50000);
		JavascriptExecutor js110 = (JavascriptExecutor) driver;
		WebElement Element100 = driver.findElement(By.xpath("//*[@class=\"agree\"]"));
		js110.executeScript("arguments[0].click();",Element100);
		System.out.println("Click on agree button");
		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		WebElement Element9 = driver.findElement(By.id("btnSubmit"));
		js10.executeScript("arguments[0].click();",Element9);
		System.out.println("Click on paynow button");
		Thread.sleep(15000);	
	}
	@Test(priority=4)
	public void PaymentPage() throws Exception {
		Thread.sleep(25000);	
		JavascriptExecutor js80 = (JavascriptExecutor) driver;
		WebElement Element79 = driver.findElement(By.xpath("//*[@id=\"option_cards\"]/a"));
		js80.executeScript("arguments[0].click();",Element79);
		System.out.println("Click on card button");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"paymethod-newCards\"]/div/ul/li/div/div[1]/div/input")).sendKeys("4578456256439173");
		System.out.println("Entered card number");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"paymethod-newCards\"]/div/ul/li/div/div[2]/div/input")).sendKeys("0522");
		System.out.println("Entered expiry date");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"paymethod-newCards\"]/div/ul/li/div/div[3]/div/input")).sendKeys("TEST");
		System.out.println("Entered Name on the card");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"paymethod-newCards\"]/div/ul/li/div/div[4]/div/input")).sendKeys("123");
		System.out.println("Entered CVV on the card");
		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"btnCards_Submit\"]"));
		js2.executeScript("arguments[0].click();",Element1);
		Thread.sleep(10000);
		

	}


}
