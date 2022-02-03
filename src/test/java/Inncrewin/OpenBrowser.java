package Inncrewin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OpenBrowser
{
	WebDriver driver;
	@Test
	@Parameters({"URL","browser"})
	public void invokebrowser(String urlname,String browser)
	{
      System.out.println(urlname);
      System.out.println(browser);
      
     
      }
	}
     


