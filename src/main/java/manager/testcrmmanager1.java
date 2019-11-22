package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcrmmanager1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        {
            driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");

            WebElement element = driver.findElement(By.className("inputBox"));
            element.click();
            element.sendKeys("TestClientManager_CA_SBPGS2");
            element = driver.findElement(By.id("txtPassword"));
            element.click();
            element.sendKeys("rules");
            element = driver.findElement(By.id("sub"));
            element.click();

            Thread.sleep(2000);

            element = driver.findElement(By.xpath("//*[@id=\"pyDisplayHarness.WorkSearch.ByName\"]"));
            element.click();
            element.sendKeys("Deal-xxx5");
            driver.findElement(By.xpath("//*[@id='RULE_KEY']/div/div/div/div[7]/span/button"));

        }
    }
}
