package manager;

import Chrome.siriusadmin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class testcrmmanager1 {
    public static void main(String[] args) throws InterruptedException /** throws InterruptedException, IOException, NoSuchElementException */{
        siriusadmin sir = new siriusadmin();
        String s = null;
        try {
            s = sir.getID();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        {
            driver.get("http://sbpgs2-qa-2.bpm.lanit:10908/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");
            driver.manage().window().maximize();

            WebElement element = driver.findElement(By.className("inputBox"));
            element.click();
            // element.sendKeys("TestClientManager_CA_SBPGS2");
            element.sendKeys("Testcrmmanager1");
            element = driver.findElement(By.id("txtPassword"));
            element.click();
            element.sendKeys("rules");
            element = driver.findElement(By.id("sub"));
            element.click();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /**  for (String winHandle : driver.getWindowHandles()) {
             driver.switchTo().window(winHandle);
             }*/
            driver.manage().window().maximize();


            element = driver.findElement(By.xpath("//*[@id='pyDisplayHarness.WorkSearch.ByName']"));
            element.click();

            BufferedReader br2 = null;
            try {
                br2 = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\for autotest\\test2.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                String k = br2.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }

            element.sendKeys(s);
            element = driver.findElement(By.xpath("//*[@name='WorkListFilter_pyDisplayHarness.WorkSearch_19']"));
            element.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try{
                boolean displayed;
                do{

                    displayed = driver.findElement(By.xpath("//*[@class='dataLabelRead gridCell']")).isDisplayed();
                    element = driver.findElement(By.xpath("//*[@name='WorkListFilter_pyDisplayHarness.WorkSearch_19']"));
                    element.click();
                    Thread.sleep(2000);

                } while(displayed);
            }
            catch (RuntimeException e) {
                //Thread.sleep(5000);
                element = driver.findElement(By.xpath("//*[@id=\"$PpgRepPgSubSectionUserWorkListGridB$ppxResults$l1\"]"));
                element.click();
            }

            //  wb = wait(10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@name='BASE_REF']/div[@id='RULE_KEY'][@index='1'][@version = '1']")));
            //element = driver.findElement(By.xpath("//*[@name='WorkListFilter_pyDisplayHarness.WorkSearch_19']"));
            // element.click();


             Thread.sleep(2500);
            //driver.close();
            driver.switchTo().frame("PegaGadget0Ifr");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//button[text()='Рассчитать зону']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//input[@class='select-dropdown'][@value='Выберите']")).click();
            driver.findElement(By.xpath("//*[@id=\"select-options-50403270-a020-011d-4748-bc8124a35253\"]/li[2]/span")).click();
            // Thread.sleep(3500);
            //driver.findElement(By.xpath("//*[@id='RULE_KEY']/div/div/div/div/fieldset/div/div/div/div/input")).click();
            //driver.findElement(By.xpath("//*[@id='select-options-43b11c3a-4644-465d-b128-5d11521700a1']/li[2]/span")).click();

        }
    }
}

