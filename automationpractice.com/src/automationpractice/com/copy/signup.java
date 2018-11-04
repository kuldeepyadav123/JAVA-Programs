package automationpractice.com.copy;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.annotations.VisibleForTesting;


public class signup 
{
	 WebDriver driver;
       @BeforeClass
	public void test()
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    String url = "http://automationpractice.com";
	    driver.get(url);
		
	}
	@Test
	public void sighnup()
	{
		

	

	   WebElement sighin= driver.findElement(By.className("login"));
	   sighin.click();
	   WebElement email= driver.findElement(By.id("email_create"));
	   email.sendKeys("Raghurawat111111111@gmail.com");
	   WebElement createaccount= driver.findElement(By.xpath("//*[@id='SubmitCreate']/span"));
	   createaccount.click();
	   WebDriverWait wait = new WebDriverWait(driver,1000);

	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("radio")));
	   WebElement Radiobttn= driver.findElement(By.id("id_gender1"));
        Radiobttn.click();
        WebElement firstname= driver.findElement(By.id("customer_firstname"));
 	    firstname.sendKeys("kuldeep");
 	   WebElement lastname= driver.findElement(By.id("customer_lastname"));
	   lastname.sendKeys("yadav"); 
	    WebElement pass= driver.findElement(By.xpath("//*[@id='passwd']"));
	    pass.sendKeys("puneetbhai");
       Select dob = new Select(driver.findElement(By.id("days")));
       dob.selectByValue("10");
       System.out.println("testing");
       Select month=new Select(driver.findElement(By.id("months")));
       month.selectByValue("5");
       Select year = new Select(driver.findElement(By.id("years")));
       year.selectByValue("1992");
       WebElement newsletter= driver.findElement(By.id("newsletter"));
	   newsletter.click();
	   WebElement firstname1= driver.findElement(By.xpath("//*[@id='firstname']"));
	   firstname1.sendKeys("");
	   WebElement company= driver.findElement(By.id("company"));
	   company.sendKeys("Ess");
	   
	   WebElement address= driver.findElement(By.id("address1"));
	   address.sendKeys("sector 71, noida");
	   WebElement address1= driver.findElement(By.id("address2"));
	   address1.sendKeys("gb nagar");
	   WebElement city = driver.findElement(By.id("city"));
	   city.sendKeys("noida");
	  Select state =new Select(driver.findElement(By.id("id_state")));
	  state.selectByValue("14");
	   WebElement postalcode= driver.findElement(By.id("postcode"));
	   postalcode.sendKeys("00000");
	   WebElement additional=driver.findElement(By.id("other"));
	   additional.sendKeys("nothing");
	   WebElement homephone =driver.findElement(By.xpath("//*[@id='phone']"));
	   homephone.sendKeys("0120123123131");
	   WebElement mobilephone= driver.findElement(By.id("phone_mobile"));
	   mobilephone.sendKeys("9458583528");
	   WebElement newaddress= driver.findElement(By.id("alias"));
	   newaddress.sendKeys("adaddadda");
	   WebElement register= driver.findElement(By.xpath("//*[@id='submitAccount']/span"));
	   register.click();
	   
	   
	}
	    
	@Test
	public void sighnin()
	
	
	{
	driver.manage().window();
		WebElement sighin = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		sighin.click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("yadavkuldeepit@gmail.com");
		WebElement password= driver.findElement(By.id("passwd"));
		password.sendKeys("puneetbhai");
		WebElement sign= driver.findElement(By.xpath("//*[@id='SubmitLogin']/span"));
		sign.click();
		System.out.println("successfully login");
		
		
		
}    @Test
	public void orderhistoryanddetail()
	{
		
		WebElement orderhistory = driver.findElement(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span"));
		orderhistory.click();
		WebElement backtoaccount= driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/a/span"));
		backtoaccount.click();
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("printed dress");
		System.out.println("printed dress");
		WebElement search1=  driver.findElement(By.xpath("//*[@id='searchbox']/button"));
		search1.click();
		WebElement dress= driver.findElement(By.xpath("//*[@id='best-sellers_block_right']/div/ul/li[1]/div/h5/a"));
		dress.click();
		WebElement Addtocart= driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span"));
		Addtocart.click();
		  WebDriverWait wait = new WebDriverWait(driver,1000);
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")));
		  
		WebElement proceedtocheckout= driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
		proceedtocheckout.click();
		WebElement pcd1=driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span"));
		pcd1.click();
		WebElement textarea= driver.findElement(By.xpath("//*[@id='ordermsg']/textarea"));
		textarea.sendKeys("please do it fast and give the best product");
		WebElement pcd2= driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span"));
		pcd2.click();
		WebElement agreeterms= driver.findElement(By.xpath("//*[@id='cgv']"));
		agreeterms.click();
		WebElement pcd3= driver.findElement(By.xpath("//*[@id='form']/p/button/span"));
		pcd3.click();
		WebElement paybybank= driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
		paybybank.click();
		WebElement confrmorder= driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span"));
		confrmorder.click();
		System.out.println("payment has been done");
		
	
	
	
		
	}
	
	

	   
	   
	   
	   
	   
	  
	 }
		
		
	


