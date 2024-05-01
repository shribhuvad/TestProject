import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IMMOCricket {

	static WebDriver driver = null;
	static String yourOrderNumber = null;
	static String purchaseOrderNumber = null;
	static WebElement element=null;
	public static void main(String[] args) {
		// Opening the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www-dev.im-mobilityonline.com/bpo/secure/Login");
		driver.manage().window().maximize();

		login();
		//waitForPageToBeReady(element);
		catalog();
		fetchingIMEI();
		orderHistory();
	}
	
	public static void wait(int min)
	{
		try {
			Thread.sleep(1000*min);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void login() {
		System.out.println("----------	Login process started	----------");
		WebElement user = driver.findElement(By.id("usernameInput"));
		user.clear();
		user.sendKeys("crickettestuser1");

		WebElement password = driver.findElement(By
				.name("password:container:input"));
		password.clear();
		password.sendKeys("Ingram@1001");

		driver.findElement(By.name(":submit")).click();
		System.out
				.println("----------	Successfully logged in as IMMO CRICKET user 	----------");
	}

	public static void waitForPageToBeReady(WebElement element) {
	//	waitForPageToBeReady("checkoutSubmitButton","By.name")
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//"document.getElementById('enter element id').checked=false;");
		for (int i = 0; i < 400; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("----------    Page Loading   ----------");
			} catch (InterruptedException e) 
			{
				System.out.println("Exception"+e.toString());
			}
			if (js.executeScript("return document.readyState").equals("complete") ) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		   // wait.until(pageLoaded);

		}
	}

	
	public static void waitForPageToBeReady1(String element,String by) {
	//	waitForPageToBeReady("checkoutSubmitButton","By.name")
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//"document.getElementById('enter element id').checked=false;");
		for (int i = 0; i < 400; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("----------    Page Loading   ----------");
				Boolean flag=(js.executeScript("return document.readyState").equals("complete") &&driver.findElement(By.linkText(element)).isEnabled());
				System.out.println("**********"+flag);
				if (js.executeScript("return document.readyState").equals("complete") &&driver.findElement(By.linkText(element)).isEnabled()) {
					try {
						Thread.sleep(1000);
						driver.findElement(By.linkText(element)).click();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}

			} catch (Exception e) 
			{
				System.out.println("Exception"+e.toString());
			}
			
		   // wait.until(pageLoaded);

		}
	}
	
	public static void catalog() {
		System.out.println("----------	Entering into the Catalog	----------");
		element = driver.findElement(By.linkText("Catalog"));
		waitForPageToBeReady(element);
		element.click();

		wait(3);
		driver.findElement(By.linkText("Phones")).click();

		wait(3);
		driver.findElement(
				By.linkText("Apple iphone 4S-16GB-Black (Reconditioned)"))
				.click();
		System.out
				.println("----------	Product selection done for purchase	----------");
		wait(2);
		WebElement quantity = driver.findElement(By
				.name("productQuantity:container:input"));
		quantity.clear();
		quantity.sendKeys("2");
		driver.findElement(By.name("addProductFormSubmitLink")).click();
		
		//element=driver.findElement(By.linkText("Continue to Cart"));
		waitForPageToBeReady1("Continue to Cart","By.linkText");
		//waitForPageToBeReady(element);
		// Continue to Shopping Cart
		//element.click();
	
		System.out
				.println("----------	Product successfully added in the Shopping Cart	----------");
		//wait(2);
       // element=driver.findElement(By.name("checkoutSubmitButton"));  
		waitForPageToBeReady1("checkoutSubmitButton","By.name");
		// Proceed to checkout page
      //  element.click();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		// System.out.println(dateFormat.format(date));
		wait(2);
		WebElement purchaseDate = driver
				.findElement(By
						.name("innerContainer:containerType:widthType:innerContainer_body:purchaseOrder:container:input"));
		purchaseDate.clear();
		purchaseDate.sendKeys("TEST" + dateFormat.format(date));
		System.out
				.println("----------	Date format conversion successfull	----------");

		wait(3);
		driver.findElement(By.linkText("Select an address")).click();

		wait(2);
		driver.findElement(By.id("id123")).click();
		wait(2);
		driver.findElement(By.id("id112")).click();
		wait(2);
		driver.findElement(
				By.name("innerContainer:containerType:widthType:innerContainer_body:shipMethodSelection"))
				.click();

		Select selectPaymentMethod = new Select(driver.findElement(By
				.id("selectPaymentMethod")));
		selectPaymentMethod.selectByVisibleText("Credit Account");

		driver.findElement(
				By.name("innerContainer:containerType:widthType:innerContainer_body:multipleConfirmationSelection:container:orderConfirmationEntry"))
				.sendKeys("abhishek.kulkarni@ingrammicro.com");

		driver.findElement(By.name("continueButton")).click();
        element=driver.findElement(By.id("termsCheckBox"));
		waitForPageToBeReady(element);
		element.click();
		
		wait(3);
		driver.findElement(By.name("submitOrderBottomButton")).click();
		System.out.println("----------	Order placed successfully	----------");
		System.out.println("----------	Exit from the Catalog	----------");

	}

	public static void fetchingIMEI() {
		wait(3);
		String substring = "Your Order Number:  ";

		yourOrderNumber = (driver.findElement(By
				.xpath("//*[@id='id147']/ul/li[2]/ul/li[3]/ul/li[2]/p[1]"))
				.getText()).trim();
		String[] parts = yourOrderNumber.split(substring);
		yourOrderNumber = parts[1];
		System.out.println("==>		Your Order Number: " + yourOrderNumber);

	}

	public static void orderHistory() {
		wait(3);
		System.out
				.println("----------	Fetching Order History report	----------");

		driver.findElement(By.linkText("Reports")).click();
		wait(5);
		driver.findElement(By.linkText("Order History Report")).click();

		Select mulOption = new Select(
				driver.findElement(By
						.name("border:containerType:widthType:border_body:logisticsCustomers:customers")));
		mulOption.selectByVisibleText("560880");
		mulOption.selectByVisibleText("560701");
		mulOption.selectByVisibleText("560701");

		wait(5);
		driver.findElement(By.linkText("Search")).click();
		element=driver.findElement(By.linkText(yourOrderNumber));
		waitForPageToBeReady(element);
		element.click();

		wait(2);
		System.out
				.println("----------	Fetching Purchase Order Number for for Order Number -"
						+ yourOrderNumber + "	----------");
		wait(2);
		purchaseOrderNumber = driver
				.findElement(
						By.xpath("//*[@id='leftLargest']/ul/li[2]/ul/li[3]/ul/li[1]/ul/li[1]/ul[3]/li[2]"))
				.getText();
		System.out.println("==>		Purchase Order Number: " + purchaseOrderNumber);
		System.out.println("----------	Accessing Printer-friendly Version of the Report 	----------");
		driver.findElement(By.linkText("Printer-friendly Version"));
		
		System.out
				.println("***************     SANITY TESTING IS COMPLETED. SITE IS UP & WORKING AS EXPECTED     ***************");
	}
}
