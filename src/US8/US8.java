package US8;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US8 extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://techno.study/tr");

        WebElement varMi = driver.findElement(By.xpath("//span[@class='t-checkbox__labeltext']"));
        varMi.getText();
        Assert.assertTrue(varMi.getText().contains("Şartları okudum ve kabul ettim."));

        WebElement termsOfUse = driver.findElement(By.xpath("//span[text()='Şartları']"));
        termsOfUse.click();

        BekleVeKapat();
    }
}
