package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.baseclass;
import UtilsLayer.LoginDropDown;

public class LoginPIMpage extends baseclass {
	
@FindBy(xpath="//b[text()='PIM']")	
WebElement PIM;
	
	@FindBy (id="empsearch_employee_status")
WebElement EmployeeStatus;
	
	@FindBy (id="Searchbtn")
	WebElement SearchButten;
	
	@FindBy (tagName="tr")
	List<WebElement> countTotalEmployee;
	
	public void PIMPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void countEmployee()
	{
		PIM.click();
		LoginDropDown.selectByVisibleText(EmployeeStatus ,"Full-Time Permanent");
		SearchButten.click();
		System.out.println(countTotalEmployee.size());
		
	}
 }
