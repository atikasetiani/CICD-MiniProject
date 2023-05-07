package starter.login;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Transactions extends PageObject {

    private By TransactionPage(){
        return By.xpath("/html/body/div/div");
    }

    public void validateOnTheTransactionPage(){
        $(TransactionPage()).isDisplayed();
    }
}
