package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Selenium;
import pomPages.SkillraryLogin;
import pomPages.WishList;

public class TestCase3 extends StepGroup {
      @Test
      public void tc3() throws IOException, InterruptedException {
    	 SkillraryLogin sl = new SkillraryLogin(driver);
    	 sl.searchtextbox(pdata.getPropertydata("coursename"));
    	 sl.gobutton();
    	 
    	 Selenium se=new Selenium(driver);
    		se.corejavaselenium();
    		
    		WishList w=new WishList(driver);
    		w.closepopup();
    		driverutilities.switchframe(driver);
    		
    		w.palybtn();
    		Thread.sleep(10000);
    		w.pausebtn();
    		driverutilities.switchbackframe(driver);
    		w.wishlist();
    	  
      }
	
}
