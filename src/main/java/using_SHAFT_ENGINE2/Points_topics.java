package using_SHAFT_ENGINE2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class Points_topics {
	private static WebDriver driver;
	
	public  Points_topics(WebDriver driver) {
		Points_topics.driver = driver;
		
	    }		PW_loginpage lp;

	
By scorepoints = By.id("Pointsscored");
By topicscount= By.id("chanesleft");

String topics;
String points;

	public void getstats() {
		lp = new PW_loginpage(driver);	
ElementActions.click(driver, lp.closebns);
	points = 	driver.findElement(scorepoints).getText();
	topics = driver.findElement(topicscount).getText();
	
	
	System.out.println(" this is topics " + topics + points);
	
	}
	
	
	public void comparestats(){
		
		BrowserActions.navigateToURL(driver, "https://playwin.live");
	int BRpoints = Integer.parseInt(points);
	int BRtops= Integer.parseInt(topics);
	String AFpoints = 	driver.findElement(scorepoints).getText();
	String AFtopics = driver.findElement(topicscount).getText();
	int actpoints = Integer.parseInt(AFpoints);
	int actTops = Integer.parseInt(AFtopics);
	
	
	Assert.assertTrue(actpoints>BRpoints , "error at point calculations");
	System.out.println("points calculated correctly user now have__" + actpoints + "__ and used to have__" + BRpoints  );
	Assert.assertTrue(actTops<BRtops, "error at topic count  calculations");
	System.out.println("user did use 1 topic.");

	

	
	
	}
	
}
