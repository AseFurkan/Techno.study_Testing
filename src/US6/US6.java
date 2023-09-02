package US6;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US6 extends BaseDriver {

    @Test
    public void US6(){

        driver.get(" https://techno.study/tr");
        MyFunc.bekle(3);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        MyFunc.bekle(3);

        WebElement logoClick= driver.findElement(By.xpath("//*[@class='t228__imglogo ']"));

        Actions actionDriver=new Actions(driver);
        actionDriver.moveToElement(logoClick).click().build().perform();

        MyFunc.bekle(3);

        BekleVeKapat();







    }




}
