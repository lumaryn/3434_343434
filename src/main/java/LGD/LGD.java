package LGD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LGD {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        {
            driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");

            WebElement element = driver.findElement(By.className("inputBox"));
            element.click();
            element.sendKeys("testuw_ca");
            element = driver.findElement(By.id("txtPassword"));
            element.click();
            element.sendKeys("rules");
            element = driver.findElement(By.id("sub"));
            element.click();

            Thread.sleep(1000);
        }
    }
}
