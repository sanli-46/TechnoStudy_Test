package TestCase;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_05 extends BaseDriver {

    @Test
    public void Test5() {

        driver.get("https://techno.study/tr");

        String anaPencereHandle = driver.getWindowHandle();

        WebElement socialLinks = driver.findElement(By.xpath("//div[@class='t-sociallinks']"));
        Assert.assertTrue("Sosyal medya hesap logoları görülmedi", socialLinks.isEnabled());

        WebElement facebookLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_facebook']"));
        Assert.assertTrue("facebook simgesi görülmedi", facebookLogo.isEnabled());

        WebElement instagramLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_instagram']"));
        Assert.assertTrue("instagram simgesi görülmedi", instagramLogo.isEnabled());

        WebElement youtubeLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_youtube']"));
        Assert.assertTrue("youtube simgesi görülmedi", youtubeLogo.isEnabled());

        WebElement linkedInLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_linkedin']"));
        Assert.assertTrue("Linkedin simgesi görülmedi", linkedInLogo.isEnabled());

        facebookLogo.click();
        instagramLogo.click();
        youtubeLogo.click();
        linkedInLogo.click();


        for (String pencereHandle : driver.getWindowHandles()) {
            if (!pencereHandle.equals(anaPencereHandle)) {
                String pencereURL = driver.getCurrentUrl();

                Assert.assertFalse("Giriş sayfası görülmedi",pencereURL.isEmpty());
            }
        }

    }
}
