import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public boolean isRegisterLinkPresent(){
        WebElement registerLink=driver.findElement(By.linkText("Register"));
        return registerLink.isDisplayed();
    }

    public boolean isLoginLinkPresent(){
        WebElement loginLink=driver.findElement(By.linkText("Log in"));
        return loginLink.isDisplayed();
    }

    public void clickOnLoginLink(){
        driver.findElement(By.linkText("Log in")).click();
    }

    public int getFeaturedProductsCount(){
        List<WebElement> expFeatureProduct = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']/div"));
        return expFeatureProduct.size();
    }
    
}
