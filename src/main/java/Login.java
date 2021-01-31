import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Login {
    private SelenideElement loginTxt=$(By.id("user-name"));
    private SelenideElement passwordTxt=$(By.id("password"));
    private SelenideElement loginButn=$(By.id("login-button"));
    private SelenideElement loginError = $(By.className("error-button"));
    private SelenideElement loginCreds = $(By.id("login_credentials"));

    public Login setLogin (String text){
        loginTxt.setValue(text);
        return this;
    }

    public Login setPassword (String text) {
        passwordTxt.setValue(text);
        return this;
    }

    public Login checkUserLoggedIn(boolean isLoggedIn){
        if(isLoggedIn){
            loginError.shouldNotBe(Condition.visible);
        }
        else {
            loginError.waitUntil(Condition.visible,60000L);
        }
        return this;
    }
        public Login clickLoginBtn(){
        loginButn.click();
        return this;
    }

    public String getText(){
        return loginCreds.getText();
    }
}
