package Chrome;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class siriusadmin {
    @Test
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        {
            driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");
            driver.manage().window().maximize();
            WebElement element = driver.findElement(By.className("inputBox"));
            element.click();
            element.sendKeys("siriusadmin");
            element = driver.findElement(By.id("txtPassword"));
            element.click();
            element.sendKeys("rules");
            Thread.sleep(2000);
            element = driver.findElement(By.id("sub"));
            element.click();
            Thread.sleep(2000);
            element.findElement(By.id(""));
            element.click();




        }}
}
