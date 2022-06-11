package StepDefinition;

import io.cucumber.java.en.When;

import static Pages.ColorFilterPage.*;

public class SD07_ColorFilter {

    @When("user selects category like Apparel >shoes")
    public void user_selects_category_like_Apparel_shoes()
    {
        select_category().click();
        select_shoes().click();
    }

    @When("user selects color filter like >red")
    public void user_selects_color_filter_like_red()
    {
        select_color_red().click();
    }

    @When("user can see red shoes only")
    public void user_can_see_red_shoes_only()
    {
        if(find_items_red().isDisplayed())
        {
            System.out.println("Red items displayed");
        }
    }
}
