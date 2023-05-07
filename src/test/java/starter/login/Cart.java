package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Cart extends PageObject {

    private By CartPage(){return By.xpath("/html/body/div/div");}

    private By bayarButton(){return By.xpath("//*[@id=\"button-bayar\"]/span");}

    private By plusIcon(){ return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[2]/button[2]/span");}

    public void validateOnTheCartPage(){
        $(CartPage()).isDisplayed();
    }

    @Step
    public void clickPlusIcon() {
        $(plusIcon()).click();
    }

    @Step
    public void clickBayarButton() {
        $(bayarButton()).click();
    }
}
