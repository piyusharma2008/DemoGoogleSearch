package DemoGoogleSearch.GooglePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
	
	
	@FindBy(id="lst-ib")
	private static WebElement txtSearchBox;
	
	
	@FindBy(xpath="//div[@class='sbqs_c']")
	private static List<WebElement> lstautoGoogle;
	
	
	
	public GoogleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Fill text to the TextBox
	public  void EnterText(String text)
	{
		txtSearchBox.sendKeys(text);
	}
	
	// Method LinkData() is Created for count and display the total auto suggection display by the google search textbox.
	public  void LinksData() 
	{
		int TotalListItem = lstautoGoogle.size();
		System.out.println("Total AutoSuggestion are :" + TotalListItem);
		for (int i = 0; i < lstautoGoogle.size(); i++) {
		System.out.println(lstautoGoogle.get(i).getText());
		}
	}

	
}
