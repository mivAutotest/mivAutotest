import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Cart {
    private SelenideElement continueBtn = $(By.className("btn_secondary"));
    private SelenideElement checkOutBtn = $(By.xpath("//a[@class='btn_action checkout_button']"));

    public MainPage clickContinueBtn(){
        continueBtn.click();
        return new MainPage();

    }
    public Checkout clickCheckOutBtn(){
        checkOutBtn.click();
        return new Checkout();
    }
}
