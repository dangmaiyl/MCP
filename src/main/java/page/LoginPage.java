package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "basic_email")
    private WebElement inputEmail;
    @FindBy(id = "basic_password")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement clickButtonLogin;

    public void navigateMCPLoginPage(String url) throws InterruptedException {
        getDriver().get(url);
        Thread.sleep(2000);
    }
    public void senkeytoTextboxEmail(String value){
        senKeyElementById(inputEmail,value);
    }
    public void senkeyToTextboxPassword(String value){
        senKeyElementById(inputPassword, value);
    }
    public void clickToButtonLogin(){
        clickElementByXpath(clickButtonLogin);
    }

}
