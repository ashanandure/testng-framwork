package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.baseclass;

public class Loginpage extends baseclass{

@FindBy(id="txtUsername")
	WebElement Username	;

@FindBy(id="txtPassword")
WebElement Password;

@FindBy(id="btnLogin")
WebElement LoginButten ;


@FindBy(id="spanMessage")
WebElement ErrorMessage ;

public Loginpage()
{
	PageFactory.initElements(driver ,this);
}
public void login(String uname,String pass)
{
	Username.sendKeys(uname);
	Password.sendKeys(pass);
	LoginButten .click();
	
	if(ErrorMessage.isDisplayed());
	{
		System.out.println(ErrorMessage.getText());
	}
}

}
 
