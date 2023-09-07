package TestCase;

import Utility.BaseDriver;
import Utility.Func;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_02 extends BaseDriver {

    @Test
    public void Test2() {

        driver.get("https://techno.study/tr");
        Func.Wait(2);

        WebElement login = driver.findElement(By.xpath("//td[text()='Campus Login']"));
        Assert.assertTrue("Login buton görünmedi", login.isEnabled());

        Func.Wait(2);
        login.click();

        Func.Wait(2);

        WebElement campusLoginPage = driver.findElement(By.xpath("//div[@class='logo']"));
        Assert.assertTrue("Campus giriş sayfası görülemedi", campusLoginPage.isEnabled());
    }
}
