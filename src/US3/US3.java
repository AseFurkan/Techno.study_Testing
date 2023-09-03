package US3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US3 extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://techno.study/tr");
        WebElement başvur=driver.findElement(By.linkText("BAŞVUR"));
        başvur.click();

        WebElement adsoyad= driver.findElement(By.xpath("//input[@name='name']"));
        adsoyad.sendKeys("test Ali KARACA");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("testalikaraca@gmail.com");

        WebElement gönder = driver.findElement(By.xpath("//button[@type='submit']"));
        Actions aksiyon = new Actions(driver);
        aksiyon.moveToElement(gönder).build().perform();

        WebElement telefon= driver.findElement(By.xpath("//span[@class='t-input-phonemask__select-triangle']"));
        telefon.click();

        WebElement andor= driver.findElement(By.cssSelector("[id='t-phonemask_ad']"));
        andor.click();

        WebElement telno= driver.findElement(By.xpath("//input[@type='tel']"));
        telno.sendKeys("123456");

        WebElement ülke = driver.findElement(By.xpath("//option[@value='Andorra']"));
        ülke.click();

        MyFunc.bekle(2);
        WebElement kurs= driver.findElement(By.xpath("//select[@name='course']"));
        kurs.click();

        WebElement sdet = driver.findElement(By.xpath("//option[@value='SDET Türkçe']"));
        sdet.click();

        WebElement ref = driver.findElement(By.xpath("//select[@name='survey']"));
        ref.click();

        WebElement başka= driver.findElement(By.xpath("//option[@value='Başka']"));
        başka.click();

        WebElement şartlar = driver.findElement(By.xpath("//div[@class='t-checkbox__indicator']"));
        şartlar.click();

        gönder.click();
    BekleVeKapat();
    }


}
