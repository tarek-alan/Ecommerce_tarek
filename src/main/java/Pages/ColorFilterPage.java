package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class ColorFilterPage {

    public static WebElement select_category()
    {
        return driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public static WebElement select_shoes()
    {
        return driver.findElement(By.xpath("//a[@title=\"Show products in category Shoes\"]"));
    }
    public static WebElement select_color_red()
    {
        return driver.findElement(By.id("attribute-option-15"));
    }
    public static WebElement find_items_red()
    {
        return driver.findElement(By.cssSelector("a[href=\"/adidas-consortium-campus-80s-running-shoes\"]"));
    }
}
