package Keywords;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import coreFramework.constants;
import coreFramework.constants.constantType;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginStepDefination {

	WebDriver driver=null;
	String env;
	
	@Given("^Launch the Gmail URL$")
	public void launch_the_Facebook_URL() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Automation\\FaceBookBDDFramework\\src\\test\\java\\Drivers\\chromedriver3.exe");
		
		driver = new ChromeDriver();
        
		try {
			env= constants.getConstantValue(constantType.Project_Link, "Gmail_URL");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        driver.get(env);
        System.out.println("Successfully Gmail is launched");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("^Verify Gmail login Page$")
	public void verify_Gmail_login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = null;
		try {
			title= constants.getConstantValue(constantType.Locator, "Title");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Gmailtitle=driver.findElement(By.xpath(title)).getText();
		System.out.println("Tile is"+Gmailtitle);
	}

	@Then("^User enter username as \"([^\"]*)\"$")
	public void user_enter_gamil(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Email_Textfield = null;
		try {
			Email_Textfield= constants.getConstantValue(constantType.Locator, "Email_Textfield");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Email_Textfield)).sendKeys(username);
		System.out.println("Email set as >> "+username);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^user enter next button$")
	public void user_enter_next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Emailnext = null;
		try {
			Emailnext= constants.getConstantValue(constantType.Locator, "EmailNext");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Emailnext)).click();
	}

	@Then("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String passwordField = null;
		try {
			passwordField= constants.getConstantValue(constantType.Locator, "Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(passwordField)).sendKeys(password);
		System.out.println("Password set as >> "+password);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@And("^user enter login button$")
	public void user_enter_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String PasswordNXT = null;
		try {
			PasswordNXT= constants.getConstantValue(constantType.Locator, "PasswordNXT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(PasswordNXT)).click();
	}

	@Then("^user verify gmail homepage$")
	public void user_verify_gmail_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = null;
		try {
			title= constants.getConstantValue(constantType.Locator, "GmailTital");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Gmailtitle=driver.findElement(By.xpath(title)).getText();
		System.out.println("Tile after ligin is "+Gmailtitle);
	}
	
	@Then("^user compose mail$")
	public void user_Compose_gmail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String compose = null;
		try {
			compose= constants.getConstantValue(constantType.Locator, "compose");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(compose)).click();
		
	}
	
	@Then("^user verify New Message popup$")
	public void user_verify_New_Message_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = null;
		try {
			title= constants.getConstantValue(constantType.Locator, "NewMessage");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String NewMessage=driver.findElement(By.xpath(title)).getText();
		System.out.println("Tile after ligin is "+NewMessage);
	}

	@Then("^user create mail To \"([^\"]*)\" Subject \"([^\"]*)\" Body \"([^\"]*)\"$")
	public void user_create_mail_To_Subject_Body(String To, String Subject, String Body) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String MailSubject=null;
		String MailTo,MessageBody = null;
		try {
			
			MailTo= constants.getConstantValue(constantType.Locator, "To_Reciever");
			driver.findElement(By.xpath(MailTo)).sendKeys(To);
			System.out.println("Mait sent to >> "+To);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			MailSubject= constants.getConstantValue(constantType.Locator, "Subject");
			driver.findElement(By.xpath(MailSubject)).sendKeys(Subject);
			System.out.println("Subject of mail is >> "+Subject);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			MessageBody= constants.getConstantValue(constantType.Locator, "MessageBody");
			driver.findElement(By.xpath(MessageBody)).sendKeys(Body);
			System.out.println("Message body is >> "+Body);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("^user attch testcase$")
	public void user_attch_testcase() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Attachment = null;
		try {
			Attachment= constants.getConstantValue(constantType.Locator, "Attachment");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Attachment)).sendKeys("C:\\Users\\admin\\Testcase.xls");
	}

	@Then("^user send email$")
	public void user_send_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Send = null;
		try {
			Send= constants.getConstantValue(constantType.Locator, "Send");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Send)).click();
		System.out.println("Successfully message sent");
	}
}
