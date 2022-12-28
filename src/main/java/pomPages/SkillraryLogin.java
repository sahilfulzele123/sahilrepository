package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
  
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gobtn;
	
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbutton() {
		gearstab.click();
	}
	public void skillrarydemoappbutton() {
		skillrarydemoapp.click();
	}
	public void searchtextbox(String course) {
		serachtb.sendKeys(course);
	}
	public void gobutton() {
		gobtn.click();
	}
}
