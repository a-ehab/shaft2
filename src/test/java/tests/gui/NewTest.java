package tests.gui;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import using_SHAFT_ENGINE2.PW_loginpage;
import using_SHAFT_ENGINE2.Points_topics;


public class NewTest {
	PW_loginpage lp;
	Points_topics st;
	
	private WebDriver driver;

	
    @BeforeClass 
    public void beforeMethod() {                                           // (3/29/2021) correction neftker el before class
	driver = BrowserFactory.getBrowser();       
	  BrowserActions.navigateToURL(driver, "https://playwin.live/ar");
    }

	@Severity (SeverityLevel.CRITICAL)
  @Test(priority=1)
  @Description("log in into playwin app using test account Desktop web")
  public void login1st() {
	  lp = new PW_loginpage(driver);
st = new Points_topics(driver);


//	  WebDriver driver = BrowserFactory.getBrowser();

	  lp.login("t@g.com", "test123123");
	  
	  st.getstats();
	  String comp_poi;
	  String Comp_tops;
	  
	  
//ElementActions.click(driver, lp.Username);
//ElementActions.type(driver, lp.Username, "t@g.com");
//ElementActions.type(driver, lp.password, "test123123");
//ElementActions.click(driver, lp.login);
  }
	@Severity (SeverityLevel.CRITICAL)
  @Test(priority=2)
	@Description("user will close the bonus and answer 10 questions")
  public void test() {

lp.bns_start();
lp.answer10q();	  

//ElementActions.click(driver, lp.closebns);
//ElementActions.click(driver, lp.start_topic);
//for(int i=1;i<11;i++) {
//System.out.println("question number "+i);
//ElementActions.click(driver, lp.ansA);
//
//
//}



//lp.login("t@g.com", "test123123");

//BrowserActions.closeCurrentWindow(driver);

  }
	@Severity (SeverityLevel.NORMAL)  
  @Test(priority=3)
	@Description("user now will compare the points after the test records and before as well as topic count")
  public void comparestats() {
	  
	  st.comparestats();
  }
  
  
  
  
  
  
  
}
