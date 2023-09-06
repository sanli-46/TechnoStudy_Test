package TestCase;
public class TC_08 {
    @Test
    public void Test2(){
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
