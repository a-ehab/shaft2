package using_SHAFT_ENGINE2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;

public class PW_loginpage {
	private static WebDriver driver;
	public  PW_loginpage(WebDriver driver) {
		
		PW_loginpage.driver = driver;
		
	    }
	
     public  By Username = By.id("email");
     public By password = By.id("password");
      public By login = By.id("LOGINBYPASSFORMBTN");
      public By closebns = By.id("RETURN-BONUS-POPUP");
      public By start_topic = By.id("StartChall");
      public By ansA = By.xpath("//input[@value='A']");
      
    
    public  void login(String Mail, String Pass) {
    	  
    	ElementActions.type(driver, Username, Mail);
    	ElementActions.type(driver, password, Pass);
    	ElementActions.click(driver, login);
    	
    	
    }
    public void bns_start(){
    	//ElementActions.click(driver, closebns);
    	ElementActions.click(driver, start_topic);
    	
    }
    
    public void answer10q() {
    	for(int i=1;i<11;i++) {
    		System.out.println("question number "+i);
    		ElementActions.click(driver, ansA);


    		}

    	
    	
    }
    

	

}
