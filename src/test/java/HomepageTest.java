import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class HomepageTest extends BaseTest {

    @Test (priority = 1)
    public void verifyRegisterLink(){
        HomePage homePage= new HomePage(driver);
        Assert.assertTrue(homePage.isRegisterLinkPresent());
    }

    @Test (priority = 2)
    public void verifyLoginLink(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLoginLinkPresent());
    }

    //@Test
    public void verifyCurrencyDropdown(){
        List<String> expCurrencies = new ArrayList<>();
        expCurrencies.add("Us Doller");
        expCurrencies.add("Euro");
    }

    @Test (priority = 3)
    public void verifyLogin(){
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLoginLink();
        driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
        driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Test
    public void verifyFeatureProduct(){
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getFeaturedProductsCount(),4);
    }
}
