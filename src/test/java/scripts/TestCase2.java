package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryDemoAppLogin;
import pomPages.SkillraryLogin;
import pomPages.Testing;

public class TestCase2 extends StepGroup{

	@Test
	public void tc2() throws IOException {
		SkillraryLogin sl= new SkillraryLogin(driver);
		sl.gearsbutton();
		sl.skillrarydemoappbutton();
		
		SkillraryDemoAppLogin sd= new SkillraryDemoAppLogin(driver);
		driverutilities.switchtabs(driver);
		driverutilities.dropdown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		Testing t = new Testing(driver);
		driverutilities.draganddrop(driver, t.getSelenium(), t.getCart());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		driverutilities.scrollbar(driver, x, y);
		t.facebookicon();
	}
}
