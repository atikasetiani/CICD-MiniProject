package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {


    private By usernameField() {
        return By.xpath("//*[@id=\"input-18\"]");
    }

    private By passwordField() {
        return By.xpath("//*[@id=\"input-21\"]");
    }

    private By loginButton() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }

    private By registerIcon() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/a");
    }

    @Step
    public static OpenUrl url(String targetUrl) {
        return new OpenUrl(targetUrl);
    }

    @Step
    public void validateOnTheLoginPage() {
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String email) {
        $(usernameField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void clickRegisterIcon() { $(registerIcon()).click();}
}

