package TestCI_CA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCI_CA {
        public static void main(String[] args) {

            System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");

            WebDriver driver = new InternetExplorerDriver();

            {
                driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");

                WebElement element = driver.findElement(By.className("inputBox"));
                element.click();
                element.sendKeys("TestCI_CA");
                element = driver.findElement(By.id("txtPassword"));
                element.click();
                element.sendKeys("rules");
                element = driver.findElement(By.id("sub"));
                element.click();

               // Thread.sleep(1000);


             // driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");

              /* element = driver.findElement(By.className("inputBox"));
                element.click();
                element.sendKeys("siriusadmin");
                element = driver.findElement(By.id("txtPassword"));
                element.click();
                element.sendKeys("rules");
                element = driver.findElement(By.id("sub"));
                element.click();





               /** WebElement element;
                //element = driver.findElement(By.id("news__tab-wrapper news__head-item"));
                //element = driver.findElement(By.id("User Name"));

                element = driver.findElement(By.className("inputBox"));



               /** Actions actions = new Actions(driver);
                actions.moveToElement(element).build().perform();
                element.sendKeys("TestCI_CA");


               /** String barcode="TestCI_CA";
                WebElement element_enter = driver.findElement(By.id("txtUserID"));
                element_enter.findElement(By.id("txtUserID")).sendKeys(barcode);
                element_enter.findElement(By.name("User Name")).sendKeys(barcode);
                element_enter.sendKeys(Keys.RETURN);

                driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B");*/
                //driver.findElement(By.id("search-field"));
             //  driver.sendKeys("1111111");


            }
        }
    }
