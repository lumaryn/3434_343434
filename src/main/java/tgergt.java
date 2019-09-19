import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

   public class tgergt {
        public static void main(String[] args) {

            System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
           // System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_Win32_3.8.0");

            WebDriver driver = new InternetExplorerDriver();

            {
                driver.get("http://sbpgs2-qa.bpm.lanit:9080/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");
                WebElement element;
                //element = driver.findElement(By.id("news__tab-wrapper news__head-item"));
                element = driver.findElement(By.id("User Name"));
                element.sendKeys("TestCI_CA");
                element = driver.findElement(By.xpath("//input[@id='passwd-id']"));


                String barcode="TestCI_CA";
                WebElement element_enter = driver.findElement(By.id("txtUserID"));
                element_enter.findElement(By.id("txtUserID")).sendKeys(barcode);
                element_enter.findElement(By.name("User Name")).sendKeys(barcode);
                element_enter.sendKeys(Keys.RETURN);

            }
        }
    }
