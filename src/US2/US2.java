package US2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US2 extends BaseDriver {

    // AC02_Cross_Campus-
    //         1. Anasayfanın üst kısmında, "Campus Girişi" veya "Log in to Campus" gibi bir seçenek bulunmalıdır.
    //         2. "Campus Girişi" seçeneğini tıkladığımda, beni Campus platformunun giriş sayfasına yönlendirmelidir.
    //         3. Campus'e giriş yapılmasına gerek yoktur (Şifre güvenliği açısından)
    @Test
    public void Test2() {

        driver.get("https://techno.study/tr/");
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr/"));


        WebElement loginButton = driver.findElement(By.xpath("(//*[@href='https://campus.techno.study'])[1]"));
        loginButton.click();
        wait.until(ExpectedConditions.urlToBe("https://campus.techno.study/"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://campus.techno.study/"));

    }
}
