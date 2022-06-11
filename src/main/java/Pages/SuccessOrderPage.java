package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinition.Hook.driver;

public class SuccessOrderPage {

    public static WebElement add_product()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]"));
    }

    public static WebElement go_to_shopping_cart()
    {
        return driver.findElement(By.xpath("//ul[@class=\"list\"]//a[@href=\"/cart\"]"));
    }
    public static WebElement agree_with_terms()
    {
        return driver.findElement(By.id("termsofservice"));
    }
    public static WebElement button_checkout()
    {
        return driver.findElement(By.xpath("//div[@class=\"cart-footer\"]//button[@id=\"checkout\"]"));
    }
    public static WebElement button_continue_address()
    {
        return driver.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]//button[@onclick=\"Billing.save()\"]"));
    }
    public static WebElement button_continue_shipping()
    {
        return driver.findElement(By.xpath("//div[@id=\"shipping-method-buttons-container\"]//button[@onclick=\"ShippingMethod.save()\"]"));
    }
    public static WebElement button_continue_payment_method()
    {
        return driver.findElement(By.xpath("//div[@id=\"payment-method-buttons-container\"]//button[@onclick=\"PaymentMethod.save()\"]"));
    }
    public static WebElement button_continue_payment_info()
    {
        return driver.findElement(By.xpath("//div[@id=\"payment-info-buttons-container\"]//button[@onclick=\"PaymentInfo.save()\"]"));
    }
    public static WebElement button_confirm()
    {
        return driver.findElement(By.xpath("//div[@id=\"checkout-step-confirm-order\"]//button[@onclick=\"ConfirmOrder.save()\"]"));
    }
    public static WebElement order_msg()
    {
        return driver.findElement(By.xpath("//div[@class=\"page-body checkout-data\"]//div[@class=\"title\"]"));
    }

}
