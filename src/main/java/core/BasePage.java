package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static final int TIME_OUT = 30;
    private static final int POLLING = 100;
    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT));
        PageFactory.initElements(driver, this);
    }

    public WebDriverWait getExplicitWait() {
        return wait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void waitElementVisible(WebElement e){
        getExplicitWait().until(ExpectedConditions.visibilityOf(e));

    }
    public void waitElementClickAble(WebElement e){
        getExplicitWait().until(ExpectedConditions.elementToBeClickable(e));
    }
    public void clickElementById(WebElement e){
        waitElementClickAble(e);
        e.click();
    }
    public void clickElementByXpath(WebElement e){
        waitElementClickAble(e);
        e.click();
    }

    public void senKeyElementById(WebElement e ,String value ){
        waitElementVisible(e);
        e.sendKeys(value);
    }
    public void senKeyElementByXpath(WebElement e ,String value ){
        waitElementVisible(e);
        e.sendKeys(value);
    }


}
