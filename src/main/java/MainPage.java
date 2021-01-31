
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement menuBtn =$(By.className("bm-burger-button"));

    public LeftMenu clickMenuBtn (){
        menuBtn.waitUntil(Condition.visible, 6000l);
        menuBtn.click();
        return new LeftMenu();
    }
}
