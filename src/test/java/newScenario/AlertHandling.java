package newScenario;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class AlertHandling {
  @Test
  public void alert() {
	  AppiumDriver driver = CreateSession.initializeDriver();
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("")).click();
	  
	  //alert dialogs
	  driver.findElement(AppiumBy.accessibilityId("")).click();
	  
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("")).click();
	  
	  //alert will open
	  Alert a1=driver.switchTo().alert();
	  System.out.println(a1.getText());
	  
	  //ok
	  a1.accept();
  }
}
