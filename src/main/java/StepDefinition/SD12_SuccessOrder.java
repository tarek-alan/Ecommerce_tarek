package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Pages.SuccessOrderPage.*;

public class SD12_SuccessOrder {

    @Given("user adds product to cart")
    public void user_adds_product_to_cart()
    {
        add_product().click();
    }

    @When("user click on shopping cart")
    public void user_click_on_shopping_cart()
    {
        go_to_shopping_cart().click();
    }

    @And("user click on agree with terms of service")
    public void user_click_on_agree_with_terms_of_service()
    {
        agree_with_terms().click();
    }

    @And("user click on checkout")
    public void user_click_on_checkout()
    {
        button_checkout().click();
    }

    @Then("continue on same address, shipping method, payment info")
    public void continue_on_same_address_shipping_method_payment_info()
    {
        button_continue_address().click();
        button_continue_shipping().click();
        button_continue_payment_method().click();
        button_continue_payment_info().click();
    }

    @And("confirm order")
    public void confirm_order()
    {
        button_confirm().click();
    }

    @And("confirm order msg")
    public void confirm_order_msg()
    {
        Assert.assertTrue(order_msg().getText().contains("Your order has been successfully processed!"),"Msg appears successfully!");
    }
}
