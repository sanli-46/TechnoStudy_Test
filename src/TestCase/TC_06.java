package TestCase;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_06 extends BaseDriver {
    @Test
    public void verifyTechnoStudyLogo() {
        SoftAssert softAssert = new SoftAssert();

        String strHomePage= "https://techno.study/tr";

        driver.get("https://techno.study/tr");
        WebElement technoStudyLogo = driver.findElement(By.cssSelector("img[alt='TechnoStudy']"));

        softAssert.assertTrue(technoStudyLogo.isDisplayed(), "Techno Study logosu görünmelidir.");
        System.out.println("Techno Study logosu gorunuyor");
        softAssert.assertTrue(technoStudyLogo.isEnabled(), "Techno Study logosu tıklanabilir olmalıdır.");
        System.out.println("Techno Study logosu tiklanabilir durumda");
        technoStudyLogo.click();

        softAssert.assertTrue(driver.getCurrentUrl().equals("https://techno.study/tr"), "Ana sayfaya yönlendirilmelidir.");

        Assert.assertEquals("https://techno.study/home", strHomePage, "Oluşanla beklenen aynı değil");

        softAssert.assertAll();
    }

}

