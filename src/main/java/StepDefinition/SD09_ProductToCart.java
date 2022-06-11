package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Pages.ProductToCartPage.*;

public class SD09_ProductToCart {

    @When("user selects category like electronics >camera >Leica >Add to cart")
    public void user_selects_category_like_electronics_camera_Leica_Add_to_cart()
    {
        select_electronics().click();
        select_camera_category().click();
        select_Lecia().click();
        add_camera_to_cart().click();
    }

    @And("msg \"The product has been added to your shopping cart\"")
    public void msg_product_has_been_added_to_your_shopping_cart()
    {
        String Expected= "The product has been added to your shopping cart";
        Assert.assertTrue(msg().getText().contains(Expected));
    }

    @And("user selects category like books >first prize pizza >Add to cart")
    public void user_selects_category_like_books_first_prize_pizza_Add_to_cart()
    {
        select_books().click();
        select_first_pizza_pies().click();
        add_book_to_cart().click();
    }

    @Then("also msg \"The product has been added to your shopping cart\"")
    public void also_msg_product_has_been_added_to_your_shopping_cart()
    {
        String Expected= "The product has been added to your shopping cart";
        Assert.assertTrue(msg().getText().contains(Expected));
    }
}
