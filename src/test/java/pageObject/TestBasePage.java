package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelUtility;
import Utilities.TakeScreenshot;
import Utilities.TextUtility;

public class TestBasePage
{
		public static WebDriver driver;
		TakeScreenshot capture;
		TextUtility writer;
		ExcelUtility excelWriter;
		protected static List<String> outputs = new ArrayList<String>();
			public TestBasePage(WebDriver driver)
			{
				TestBasePage.driver=driver;
				PageFactory.initElements(driver,this);
				capture = new TakeScreenshot();
				writer=new TextUtility();
				excelWriter=new ExcelUtility();
			}
}
