package US1_;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US1 extends BaseDriver {
    //   Anasayfada Kursları Gösteren
    //   Dropdown Menüsünü Görüntüleme

    @Test
    public void courses() {

        driver.get("https://techno.study/tr/");
        MyFunc.bekle(2);

        
        coursesButton();
        WebElement courseSdet = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[1]"));
        courseSdet.click();
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr/sdet"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://techno.study/tr/sdet"));


        coursesButton();
        WebElement courseDevApp = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[2]"));
        courseDevApp.click();
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr/androidapp"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://techno.study/tr/androidapp"));

        coursesButton();
        WebElement courseData = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[3]"));
        courseData.click();
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr/data"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://techno.study/tr/data"));

        coursesButton();
        WebElement courseJobCenter = driver.findElement(By.xpath("(//*[@class='t966__menu-item-title t-name'])[4]"));
        courseJobCenter.click();
        wait.until(ExpectedConditions.urlToBe("https://techno.study/jobcenter"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://techno.study/jobcenter"));
        MyFunc.bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfanının sonuna gider.
        MyFunc.bekle(2);

        WebElement jobPageMasterCourses=driver.findElement(By.xpath("//*[@href='http://techno.study/masters']"));
        jobPageMasterCourses.click();


        wait.until(ExpectedConditions.urlToBe("https://techno.study/masters"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://techno.study/masters"));

        BekleVeKapat();
    }



    private void coursesButton() {

        WebElement courseButton = driver.findElement(By.xpath("//*[@href='#submenu:programs']"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(courseButton).click().build().perform();
        MyFunc.bekle(2);

    }


}

