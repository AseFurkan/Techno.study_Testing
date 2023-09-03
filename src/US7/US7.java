package US7;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US7 extends BaseDriver {

    @Test
    public void US7(){

        driver.get("https://techno.study/tr");
        MyFunc.bekle(2);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 2000);");
        MyFunc.bekle(5);

        WebElement moreInfo= driver.findElement(By.xpath("//*[@class='tn-atom']"));
        Actions action=new Actions(driver);
        action.moveToElement(moreInfo).click().build().perform();
        MyFunc.bekle(5);

        WebElement logoClick1= driver.findElement(By.xpath("//*[@class='t228__imglogo ']"));
        action.moveToElement(logoClick1).click().build().perform();

        JavascriptExecutor jo= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 2500);");
        MyFunc.bekle(5);

        WebElement moreInfo2= driver.findElement(By.xpath("//*[@class='t396__elem tn-elem tn-elem__4822243271663336291315']"));
        action.moveToElement(moreInfo2).click().build().perform();
        MyFunc.bekle(5);

        WebElement logoClick2= driver.findElement(By.xpath("//*[@class='t228__imglogo ']"));
        action.moveToElement(logoClick2).click().build().perform();

        JavascriptExecutor jw= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 3000);");
        MyFunc.bekle(5);

        WebElement moreInfo3= driver.findElement(By.xpath("(//*[text()='Learn more'])[1]"));
        action.moveToElement(moreInfo3).click().build().perform();
        MyFunc.bekle(5);

        WebElement logoClick3= driver.findElement(By.xpath("//*[@class='t228__imglogo ']"));
        action.moveToElement(logoClick3).click().build().perform();


        BekleVeKapat();









    }



}
