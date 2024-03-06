package Web_Testing;

import framework.ActionsUtil;
import framework.Xpathss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginPage {

    WebDriver d;
    WebDriverWait w= ActionsUtil.b_wait();
    @Test()
    public void launch()
    {
        d= ActionsUtil.getDriver();
        d.get("https://www.facebook.com/");
    }
    @Test()
    public void login()
    {
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpathss.username)));
        d.findElement(By.xpath(Xpathss.username)).click();
        d.findElement(By.xpath(Xpathss.username)).sendKeys("9391800036");
        d.findElement(By.xpath(Xpathss.password)).click();
        d.findElement(By.xpath(Xpathss.password)).sendKeys("Falcon9391.");
        d.findElement(By.xpath(Xpathss.login)).click();
    }
}
