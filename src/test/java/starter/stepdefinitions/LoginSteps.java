package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.*;

public class LoginSteps{

    @Steps
    Login login;
    @Steps
    Products products;
    @Steps
    Register register;
    @Steps
    Details details;
    @Steps
    Cart cart;
    @Steps
    Transactions transactions;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.validateOnTheLoginPage();
    }

    @When("I click icon register")
    public void clickRegisterIcon(){
        login.clickRegisterIcon();
    }

    @When("I enter valid email")
    public void enterValidUsername(){
        login.inputUsername("setianias@gmail.com");
    }

    @When("I enter invalid email")
    public void enterInvalidUsername(){
        login.inputUsername("setianiatikadewi@gmail.com");
    }

    @When("I enter empty email")
    public void enterEmptyUsername(){
        login.inputUsername("");
    }

    @And("I enter valid password")
    public void enterValidPassword(){
        login.inputPassword("setianias");
    }

    @And("I enter invalid password")
    public void enterInvalidPassword(){
        login.inputPassword("Atika1");
    }

    @And("I enter empty password")
    public void enterEmptyPassword(){
        login.inputPassword("");
    }

    @And("I enter valid full name")
    public void enterValidFullnameRegister(){
        register.inputFullnameRegister("Atika Setial");
    }

    @And("I enter valid email in register")
    public void enterValidEmailRegister(){
        register.inputEmailRegister("setianiatil@gmail.com");
    }

    @And("I enter valid password in register")
    public void enterValidPasswordRegister(){
        register.inputPassword("Setial12");
    }

    @And("I click login button")
    public void clickLoginButton(){ login.clickLoginButton();}

    @And("I click register button")
    public void clickRegisterButton(){register.clickRegisterButton();}

    @And("I click detail button from one of product")
    public void clickDetailButton(){products.clickdetailButton();}

    @And("I click buy button from one of product")
    public void clickBeliButton(){products.clickBeliButton();}

    @And("I click buy button from one of the other products")
    public void clickOtherBeliButton(){products.clickOtherBeliButton();}

    @And("I click cart icon")
    public void clickCartIcon(){products.clickCartIcon();}

    @And("I click plus icon")
    public void clickPlusIcon(){cart.clickPlusIcon();}

    @And("I clicked the plus icon one more time")
    public void clickPlusIconMore(){cart.clickPlusIcon();}

    @And("I click payment button")
    public void clickBayarButton(){cart.clickBayarButton();}

    @Then("I am on the register page")
    public void onTheRegisterPage(){register.validateOnTheRegisterPage();}

    @Then("I am on the product page")
    public void onTheProductPage(){products.validateOnTheProductsPage();}

    @Then("I can't be on the product page")
    public void cantTheProductPage(){login.validateOnTheLoginPage();}

    @Then("I am success to register and switch on the login page")
    public void successOnTheLoginPage(){login.validateOnTheLoginPage();}

    @Then("I see product details")
    public void seeProductDetails(){details.validateOnTheDetailPage();}

    @Then("I success to add purchase product in the cart")
    public void successAddPurchaseProduct(){cart.validateOnTheCartPage();}

    @Then("I see the purchase details of a product in cart")
    public void seePurchaseProduct(){cart.validateOnTheCartPage();}

    @Then("I was successful in increasing the quantity to three")
    public void successIncreaseProduct(){cart.validateOnTheCartPage();}

    @Then("I see the details of a product purchase transaction in the cart")
    public void seeTransactionDetails(){transactions.validateOnTheTransactionPage();}
}
