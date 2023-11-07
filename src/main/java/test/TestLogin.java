package test;

import core.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;

public class TestLogin extends BaseTest {
    @Test
    public void Login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.navigateMCPLoginPage("https://quark-fe.skydemo.vn/signin");
        loginPage.senkeytoTextboxEmail("annalee300475@gmail.com");
        loginPage.senkeyToTextboxPassword("123123123");
        loginPage.clickToButtonLogin();
    }


}
