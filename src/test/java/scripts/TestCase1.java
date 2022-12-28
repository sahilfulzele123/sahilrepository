package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Addtocart;
import pomPages.SkillraryDemoAppLogin;
import pomPages.SkillraryLogin;

public class TestCase1 extends StepGroup {
   
	@Test
	public void tc1() {
		SkillraryLogin sl=new SkillraryLogin(driver);
		sl.gearsbutton();
		sl.skillrarydemoappbutton();
		
		SkillraryDemoAppLogin sd= new SkillraryDemoAppLogin(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mousehover(driver, sd.getCoursetab());
		sd.seleniumtraining();
		
		Addtocart ad = new Addtocart(driver);
		driverutilities.doubleclick(driver, ad.getAddbtn());
		ad.addtocart();
		driverutilities.alertpopup(driver);
				
	}
	
	
	
	
}
