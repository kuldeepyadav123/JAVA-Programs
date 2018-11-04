package automationpractice.com.copy;

import org.openqa.selenium.WebDriver;

public class mainclass 
{
	
	public static void main(String[] args)
	{
	
		signup obj= new signup();
		
		//obj.sighnup();
		//System.out.println("successfully sighnup");
		obj.sighnin();
		obj.orderhistoryanddetail();
		
		
		
	}

}
