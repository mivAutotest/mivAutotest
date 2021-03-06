
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;


public class TestSelenideClass {
    private Login loginPage;
    String login = "standard_user";
    String pass = "secret_sauce";
    String passgavno = "secrt_sauce";
private MainPage mainPage;

    TestSelenideClass(){
        loginPage = new Login();
        mainPage = new MainPage();
    }

    @Test
    public void userCanLoginByUsername() {
        open("https://www.saucedemo.com/");
        loginPage.setLogin(login)
                .setPassword(passgavno)
                .clickLoginBtn()
                .checkUserLoggedIn(false);
        Assert.assertTrue(loginPage.getText().contains("usernames"), "Check that element " + loginPage.getText() + " contains text 'usernames");
        loginPage.setPassword(pass)
                .clickLoginBtn()
                .checkUserLoggedIn(true);
        mainPage.clickMenuBtn()
                .clickLogoutBtn()
                .setLogin(login)
                .setPassword(pass)
                .clickLoginBtn()
                .checkUserLoggedIn(true);
    }



}
