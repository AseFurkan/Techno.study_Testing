package US4;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US4 extends BaseDriver {
    @Test
    public void test4(){
        driver.navigate().to("https://techno.study/tr");
        WebElement kurslar= driver.findElement(By.xpath("//a[text()='Kurslar']"));
        kurslar.click();

        WebElement sdet= driver.findElement(By.xpath("//div[@class='t966__menu-item-title t-name']"));
        sdet.click();
        MyFunc.bekle(2);

        driver.navigate().back();
        MyFunc.bekle(2);

        kurslar.click();

        WebElement android=driver.findElement(By.xpath("//div[text()='Android uygulama geliştirme']"));
        android.click();
        MyFunc.bekle(2);

        driver.navigate().back();

        kurslar.click();

        WebElement veribilimi=driver.findElement(By.xpath("//div[text()='Veri bilimi']"));
        veribilimi.click();
        MyFunc.bekle(2);

        driver.navigate().back();

        kurslar.click();

        WebElement job=driver.findElement(By.xpath("//div[text()='Job Center & Arbeitsamt']"));
        job.click();
        MyFunc.bekle(2);

        driver.navigate().back();

        WebElement master= driver.findElement(By.linkText("Master's Program"));
        master.click();

        driver.navigate().back();

        BekleVeKapat();













    }

}
