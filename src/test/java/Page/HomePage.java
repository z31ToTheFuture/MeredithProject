package Page;

import Utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {


    @FindBy(xpath="//*[@id=\"search-block\"]")
    private WebElement SearchBox;

    @FindBy(xpath = "//button[@class='button searchButton']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"search-results-heading\"]")
    private WebElement searchResults;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

public void search(String text){
        sendText(SearchBox,text);
        click(searchButton);
}

public String getResults()
{
    String res = searchResults.getText();
    return res;
}



}
