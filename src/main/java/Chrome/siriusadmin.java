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
            element = driver.findElement(By.id("sub"));
            element.click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"Tab5\"]")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"$PD_RulesExplorerData$ppxResults$l6\"]/ul[1]/li[1]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"$PD_RulesExplorerData$ppxResults$l6$ppxResults$l12\"]/ul/li[2]")).click();

            Thread.sleep(1000);
            driver.switchTo().frame("PegaGadget0Ifr");
            driver.findElement(By.xpath("//tr[@id='$PpgRepPgSubSectionpzViewInstancesB$ppxResults$l1']/td/div")).click();







           /** try {

                driver.findElement(By.xpath("//*[@id=\"PegaGadget0Ifr\"]")).click();

            }catch (Exception e) {
                System.out.println("Некорректное число");
            }


            /**vghggh*/



       /**     try {

                driver.findElement(By.xpath("//*[@id=\"EXPAND-OUTERFRAME\"]")).click();

            }catch (Exception e) {
                System.out.println("Некорректное число");
            }

            try {

                driver.findElement(By.xpath("//*[@id=\"EXPAND-OUTERFRAME\"]")).click();

            }catch (Exception e) {
                System.out.println("Некорректное число");
            }*/



            //driver.findElement(By.cssSelector("button.btn.btn-default")).click();
            //driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div")).click();






        }}
}
