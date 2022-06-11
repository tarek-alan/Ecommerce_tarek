package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static Pages.CompareListPage.*;
import static StepDefinition.Hook.driver;

public class SD11_CompareList {
    SoftAssert softAssert = new SoftAssert();

    @When("user click on add to comparelist")
    public void user_click_on_add_to_comparelist() {
        compareListIcon1().click();
        Hook.sleep(20);
    }


    @Then("go back to home and choose another productcompare")
    public void go_back_to_home_and_choose_another_productcompare()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
        CompareListIcon2().click();
    }

    @And("user should found the product added to comparelist in the comparelist")
    public void user_should_found_the_product_added_to_comparelist_in_the_comparelist() {

        CompareListButton().click();
        softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/compareproducts", "Not ");
        softAssert.assertEquals(driver.findElement(By.cssSelector("img[alt=\"Picture of Build your own computer\"]]")).getText(), "Build your own computer", "Wrong product in wishlist");
        softAssert.assertEquals(driver.findElement(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]]")).getText(), "HTC One M8 Android L 5.0 Lollipop", "Wrong product in wishlist");
        softAssert.assertAll();
        System.out.println("Add products to comparelist successfully");

    }

}
