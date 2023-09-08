package TestCase;

import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

public class AllTestCase extends BaseDriver {

    @Test
    public void Test1() {

    }

    @Test
    public void Test2() {

    }

    @Test
    public void Test3() {
        driver.get("https://techno.study/tr/");

        WebElement basvur = driver.findElement(By.linkText("BAŞVUR"));
        basvur.click();
        Func.Wait(2);

        WebElement ad = driver.findElement(By.xpath("//input[@name='name']"));
        ad.sendKeys("Test Can Can");
        Func.Wait(2);

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("Testcovaja5931@gameszox.com");
        Func.Wait(2);

        WebElement telefon = driver.findElement(By.xpath("//input[@name='tildaspec-phone-part[]']"));
        telefon.sendKeys("1111111111111");
        Func.Wait(2);

        WebElement ülkeAndorra = driver.findElement(By.cssSelector("[id='sb-1667664755026'] [value='Andorra']"));
        ülkeAndorra.click();
        Func.Wait(2);

        WebElement KursSecim = driver.findElement(By.cssSelector("[id='sb-1663337581601'] [value='SDET Türkçe']"));
        KursSecim.click();
        Func.Wait(2);

        WebElement NerdenDuydum = driver.findElement(By.cssSelector("[id='sb-1670423010572'] [value='Youtube']"));
        NerdenDuydum.click();
        Func.Wait(2);

        WebElement PromasyonKodu = driver.findElement(By.xpath("//input[@name='promo code']"));
        PromasyonKodu.sendKeys("Hikmet Anıl Öztekin");
        Func.Wait(2);

        WebElement Şartlar = driver.findElement(By.xpath("//div[@class='t-checkbox__indicator']"));
        Şartlar.click();
        Func.Wait(2);

        WebElement Gonder = driver.findElement(By.xpath("//button[@class='t-submit']"));
        Gonder.click();
        Func.Wait(2);

    }

    @Test
    public void Test4() {
        driver.get("https://techno.study/tr");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll...
        js.executeScript("window.scrollTo(0,7000);");
        Func.Wait(1);

        WebElement sDet = driver.findElement(By.linkText("SDET Yazılım Test Mühendisi"));
        sDet.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement androidApp = driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        androidApp.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement dataScience = driver.findElement(By.linkText("Veri bilimi"));
        dataScience.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("data"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement masterProgram = driver.findElement(By.linkText("Master's Program"));
        masterProgram.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("masters"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

    }

    @Test
    public void Test5() {

    }


    @Test
    public void Test6() {

        SoftAssert softAssert = new SoftAssert();

        String strHomePage = "https://techno.study/tr";

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

    @Test
    @Parameters("msg")

    public void Test7(String text) {

        driver.get("https://techno.study/tr");

        WebElement courses = driver.findElement(By.cssSelector("[href='#submenu:programs']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(courses).build().perform();

        switch (text) {
            case "SDET Yazılım Test Mühendisi":
                WebElement sdt = driver.findElement(By.cssSelector("[class=\"t966__menu-item-text\"]"));
                sdt.click();

                break;
            case "Android uygulama geliştirme":
                WebElement andro = driver.findElement(By.xpath("//div[text()='Android uygulama geliştirme']"));
                andro.click();

                break;
            case "Veri bilimi":
                WebElement veri = driver.findElement(By.xpath("//div[text()='Veri bilimi']"));
                veri.click();

                break;
            case "Job Center  Arbeitsamt":
                WebElement job = driver.findElement(By.xpath("//div[text()='Job Center & Arbeitsamt']"));
                job.click();
                try {

                    WebElement iframe = driver.findElement(By.xpath("//img[@alt=\"TechnoStudy\"]"));
                    new Actions(driver).
                            scrollToElement(iframe).
                            build().
                            perform();
                } catch (Exception ignored) {

                }

                break;
            case "Master's Program":
                WebElement master = driver.findElement(By.xpath("//div[text()=\"Master's Program\"]"));
                master.click();
                break;
        }
        try {

            WebElement logo = driver.findElement(By.xpath("//img[@alt=\"TechnoStudy\"]"));
            wait.until(driver -> logo.isDisplayed()).wait();
            Assert.assertTrue(logo.isDisplayed(), "Logo Yok");
        } catch (Exception ignored) {

        }

        WebElement btn = driver.findElement(By.xpath("//a[@class='tn-atom']"));
        btn.click();
    }

    @Test
    public void Test8() {
        driver.get("https://techno.study/tr");
        try{
            WebElement TermsOfUse = driver.findElement(By.xpath("//Span[text()='Şartları']"));
            TermsOfUse.click();

            WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Kullanım Şartları']")));
            Assert.assertTrue(page.isEnabled(), "Sayfa bulunamadı");
        }catch (Exception e){
            System.out.println("Elementi bulamadı");
        }
    }
}
