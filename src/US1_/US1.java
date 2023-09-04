package US1_;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
        MyFunc.bekle(2);

        coursesButton();
        WebElement courseDevApp = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[2]"));
        courseDevApp.click();
        MyFunc.bekle(2);

        coursesButton();
        WebElement courseData = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[3]"));
        courseData.click();
        MyFunc.bekle(2);

        coursesButton();
        WebElement courseJobCenter = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[4]"));
        courseJobCenter.click();
        MyFunc.bekle(2);

        coursesButton();
        WebElement courseMaster = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[5]"));
        courseMaster.click();
        MyFunc.bekle(2);

        BekleVeKapat();
    }



    private void coursesButton() {

        WebElement courseButton = driver.findElement(By.xpath("//*[@href='#submenu:programs']"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(courseButton).click().build().perform();
        MyFunc.bekle(2);

    }


}

