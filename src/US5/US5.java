package US5;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class US5 extends BaseDriver {

    @Test
    public void US5(){

        driver.get(" https://techno.study/tr");
        MyFunc.bekle(3);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        MyFunc.bekle(3);

        WebElement faceeBook= driver.findElement(By.xpath("(//*[@target='_blank'])[1]"));
        faceeBook.click();

        MyFunc.bekle(3);

        BekleVeKapat();












    }



}
