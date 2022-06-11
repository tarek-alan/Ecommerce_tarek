package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static StepDefinition.Hook.driver;

public class CompareListPage {
    public static WebElement specificProduct() {
        return driver.findElement(By.cssSelector("div[class=\"product-grid home-page-product-grid\"]"));
    }

    public static WebElement compareListIcon1() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[2]"));
    }
    public static WebElement CompareListIcon2() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]"));
    }
        public static WebElement CompareListButton() {
        return driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }

    public static WebElement message() {
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

}
