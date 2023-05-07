package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Products extends PageObject {
    private By title(){
        return By.id("app");
    }

    private By detailButton(){ return By.xpath("//*[@id=\"13361\"]/div/div[3]/div[2]/button[1]/span");}

    private By beliButton(){ return By.xpath("//*[@id=\"13361\"]/div/div[3]/div[2]/button[2]/span");}

    private By beliButtonOther(){ return By.xpath("//*[@id=\"13378\"]/div/div[3]/div[2]/button[2]/span");}

    private By cartIcon(){ return By.xpath("/html/body/div/div/header/div/button[1]/span/span/i");}

    public void validateOnTheProductsPage(){
        $(title()).isDisplayed();
    }
    @Step
    public void clickdetailButton() {
        $(detailButton()).click();
    }
    @Step
    public void clickBeliButton() {
        $(beliButton()).click();
    }
    @Step
    public void clickOtherBeliButton() {
        $(beliButtonOther()).click();
    }
    @Step
    public void clickCartIcon() {
        $(cartIcon()).click();
    }
}
