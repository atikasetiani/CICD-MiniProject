package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

    private By fullnameRegisterField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By emailRegisterField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By passwordRegisterField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }

    private By registerButton() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }


    @Step
    public static OpenUrl url(String targetUrl) {
        return new OpenUrl(targetUrl);
    }

    @Step
    public void validateOnTheRegisterPage() {
        $(registerButton()).isDisplayed();
    }

    @Step
    public void inputFullnameRegister(String fullname) {
        $(fullnameRegisterField()).type(fullname);
    }

    @Step
    public void inputEmailRegister(String email) {
        $(emailRegisterField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordRegisterField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();
    }


}
