package StepDefinition;

import Pages.WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static Pages.WishlistPage.*;
import static StepDefinition.Hook.driver;

public class SD10_Wishlist {
    SoftAssert softAssert = new SoftAssert();

    @When("user click on add to wishlist")
    public void user_click_on_add_to_wishlist() {
        wishlistIcon1().click();
        Hook.sleep(20);
    }

    @And("user select attributes for product if found")
    public void user_select_attributes_for_product_if_found() {
        WishlistPage.selectTypeOfProcessor();
        WishlistPage.selectRam();
        WishlistPage.selectHDD();
        WishlistPage.selectOS();
        WishlistPage.selectSoftware();
        wishlistButton().click();
    }

    @Then("go back to home and choose another product")
    public void go_back_to_home_and_choose_another_product()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
        WishlistPage.wishlistIcon2().click();
    }

    @And("user should found the product added to wishlist in the wishlist")
    public void user_should_found_the_product_added_to_wishlist_in_the_wishlist() {

        String expectedMessage = "The product has been added to your wishlist";
        softAssert.assertTrue(message().getText().contains(expectedMessage), "Not add in wishlist");

        if (message().isDisplayed()) {
            driver.findElement(By.cssSelector(".content > a:nth-child(1)")).click();
            softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/wishlist", "Not ");
            softAssert.assertEquals(driver.findElement(By.cssSelector("img[alt=\"Picture of Build your own computer\"]]")).getText(), "Build your own computer", "Wrong product in wishlist");
            softAssert.assertEquals(driver.findElement(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]]")).getText(), "HTC One M8 Android L 5.0 Lollipop", "Wrong product in wishlist");
            softAssert.assertAll();
            System.out.println("Add products to wishlist successfully");
        }
    }
}
