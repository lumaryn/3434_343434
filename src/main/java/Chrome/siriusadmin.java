package Chrome;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class siriusadmin {

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
            Thread.sleep(1000);
            driver.findElement(By.xpath("//tr[@id='$PpgRepPgSubSectionpzViewInstancesB$ppxResults$l1']/td/div")).click();
            driver.switchTo().defaultContent();
            Thread.sleep(1000);
            driver.switchTo().frame("PegaGadget1Ifr");
            driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div[3]/div/div/span")).click();

            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1000);
            element = driver.findElement(By.xpath("//*[@id='pyConnectionFactory']"));
            element.click();
            element.sendKeys("jms/Q.APKKB.CF");
            element = driver.findElement(By.xpath("//*[@id=\"pyDestination\"]"));
            element.click();
            element.sendKeys("jms/ESB.APKKB.REQUEST");

            driver.findElement(By.xpath("//*[@id=\"HarnessFooter\"]/tbody/tr/td[2]/table/tbody/tr/td[2]/nobr/table/tbody/tr/td[1]")).click();

            element = driver.findElement(By.xpath("//*[@id='EXPAND']"));
            element.click();
            VariableA a = new VariableA();
            StringBuffer b = a.getA(a.getA());

            element.sendKeys(b);




            //Thread.sleep(500);
            //driver.switchTo().parentFrame();
            //driver.switchTo().frame("PegaGadget1Ifr");
            //driver.findElement(By.xpath("//*[@id=\\\"RULE_KEY\\\"]/div/div/div/div[2]/div/div/div/div/div[3]/div/div/span")).click();
           // driver.switchTo().frame("PegaGadget1Ifr");
          //  (.//*[normalize-space(text()) and normalize-space(.)='JNDI Server'])[3]/following::span[4]
          //  driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div[3]/div/div/span"));







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
