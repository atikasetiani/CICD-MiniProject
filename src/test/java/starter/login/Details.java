package starter.login;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Details extends PageObject {

    private By DetailPage(){
        return By.xpath("/html/body/div/div");
    }

    public void validateOnTheDetailPage(){
        $(DetailPage()).isDisplayed();
    }

}
