package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class ProductToCartPage {

    public static WebElement select_electronics ()
    {
        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]"));
    }


    public static WebElement select_camera_category ()
    {
        return driver.findElement(By.cssSelector("a[title=\"Show products in category Camera & photo\"]"));
    }

    public static WebElement select_Lecia ()
    {
        return driver.findElement(By.xpath("//div[@class=\"product-grid\"]//img[@alt=\"Picture of Leica T Mirrorless Digital Camera\"]"));
    }

    public static WebElement add_camera_to_cart ()
    {
        return driver.findElement(By.xpath("//div[@class=\"add-to-cart\"]//button[@type=\"button\"]"));
    }

    public static WebElement msg ()
    {
        return driver.findElement(By.xpath("//p[@class=\"content\"]"));
    }

    public static WebElement select_books ()
    {
        return driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/books\"]"));
    }

    public static WebElement select_first_pizza_pies ()
    {
        return driver.findElement(By.cssSelector("img[alt=\"Picture of First Prize Pies\"]"));
    }

    public static WebElement add_book_to_cart ()
    {
        return driver.findElement(By.xpath("//div[@class=\"add-to-cart-panel\"]//button[@type=\"button\"]"));
    }
}
