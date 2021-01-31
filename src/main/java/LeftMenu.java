import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenu {

    private SelenideElement allBtn = $(By.id("inventory_sidebar_link"));
    private SelenideElement aboutBtn = $(By.id("about_sidebar_link"));
    private SelenideElement logoutBtn = $(By.id("logout_sidebar_link"));
    private SelenideElement resetBtn = $(By.id("reset_sidebar_link"));

    public MainPage clickAllBtn(){
        allBtn.click();
        return new MainPage();
    }
    public About clickAboutBtn(){
        aboutBtn.click();
        return new About();
    }
    public Login clickLogoutBtn(){
        logoutBtn.click();
        return new Login();
    }

}
