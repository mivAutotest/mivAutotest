
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;


public class TestSelenideClass {
    private Login loginPage;
    String login = "standard_user";
    String pass = "secret_sauce";
    String passgavno = "secrt_sauce";


    TestSelenideClass(){
        loginPage = new Login();
    }

    @Test
    public void userCanLoginByUsername() {
        open("https://www.saucedemo.com/");
        loginPage.setLogin(login)
                .setPassword(passgavno)
                .clickLoginBtn()
                .checkUserLoggedIn(false);
        Assert.assertFalse(loginPage.getText().contains("usernames"), "Check that element " + loginPage.getText() + " contains text 'usernames");
    }


}
