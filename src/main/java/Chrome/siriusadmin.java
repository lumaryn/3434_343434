package Chrome;


import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class siriusadmin {
    public String crm_id;


    public String Sirius() throws InterruptedException, IOException /**main(String[] args) throws InterruptedException, IOException */{

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        {
            driver.get("http://sbpgs2-qa-2.bpm.lanit:10908/prweb/PRServlet/3EmOSbam7UQMneCCqrdaiQ%5B%5B*/!STANDARD");
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

            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"$PD_RulesExplorerData$ppxResults$l6$ppxResults$l12\"]/ul/li[2]")).click();

            Thread.sleep(2000);
            driver.switchTo().frame("PegaGadget0Ifr");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//tr[@id='$PpgRepPgSubSectionpzViewInstancesB$ppxResults$l1']/td/div")).click();
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
            driver.switchTo().frame("PegaGadget1Ifr");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div[3]/div/div/span")).click();

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Thread.sleep(1500);
            element = driver.findElement(By.xpath("//*[@id='pyConnectionFactory']"));
            element.click();
            element.sendKeys("jms/Q.APKKB.CF");
            element = driver.findElement(By.xpath("//*[@id=\"pyDestination\"]"));
            element.click();
            element.sendKeys("jms/ESB.APKKB.REQUEST");


            BufferedReader br5 = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\for autotest\\OPF_work.txt"));
            List<String> IDofOPF = new ArrayList<>();
            String b;

            int r = 147;
            for (int j = 0; j < r; j++)

         // while ((br5.readLine() != null))
            {
                b = br5.readLine();
                IDofOPF.add(b);
            }
           // List<String> IDofOPF1 = new ArrayList<>(new LinkedHashSet<>(IDofOPF));
            br5.close();



            int i = 0;
            int Conec = 0;
            while (i < 1) {


                driver.findElement(By.xpath("//*[@id=\"HarnessFooter\"]/tbody/tr/td[2]/table/tbody/tr/td[2]/nobr/table/tbody/tr/td[1]")).click();

Thread.sleep(2000);
                element = driver.findElement(By.xpath("//*[@id='EXPAND']"));
                element.click();
                // VariableA XMLka = new VariableA();
                //String a = XMLka.getA();
                //System.out.println(a);
                // element.sendKeys(a);

            /*StringSelection selection = new StringSelection(a);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, selection);*/
                String a = "";
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\for autotest\\test2.txt"));
                a = br.readLine();
                br.close();


                // String x = "xxx";

                BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\for autotest\\test3.txt"));

                String num2 = br2.readLine();
                int num = Integer.parseInt(num2);
                num++;
                num2 = Integer.toString(num);
                br2.close();

                String content = IOUtils.toString(new FileInputStream("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));
                content = content.replaceAll(a, "xxx" + num2);
                IOUtils.write(content, new FileOutputStream("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));


                FileWriter wr = new FileWriter("C:\\Users\\user\\Desktop\\for autotest\\test2.txt");
                wr.write("xxx" + num2);
                wr.close();

                FileWriter wr2 = new FileWriter("C:\\Users\\user\\Desktop\\for autotest\\test3.txt");
                wr2.write(num2);
                wr2.close();


                String s = "";
                Scanner in = new Scanner(new File("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));
                while (in.hasNext())
                    s += in.nextLine() + "\r\n";


                StringSelection selection = new StringSelection(s);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, selection);
                element.sendKeys(Keys.CONTROL, "v");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id='HarnessFooter']/tbody/tr/td[2]/table/tbody/tr/td[2]/nobr/table/tbody/tr/td[2]/button")).click();
                Thread.sleep(5000);


/**здесь смена опф*/System.out.println(IDofOPF);
                String content3 = IOUtils.toString(new FileInputStream("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));
                content3 = content3.replaceAll(IDofOPF.get(i), IDofOPF.get(i + 1));
                IOUtils.write(content3, new FileOutputStream("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));

                this.crm_id="xxx"+num2;

                i++;
                Conec = i; /**запоминаем айди в аррейлисте*/
                //Thread.sleep(5000);

            }
            driver.close();
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            driver.close();

            /**возврат на 1 опф*/
            String content2 = IOUtils.toString(new FileInputStream("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));
            content2 = content2.replaceAll(IDofOPF.get(Conec), IDofOPF.get(0));
            IOUtils.write(content2, new FileOutputStream("C:\\Users\\user\\Desktop\\for autotest\\test.txt"));




      /*      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test.txt"));
            // a = br.readLine();
            String b;

            while( ( b = br.readLine() ) != null ) {

                StringSelection selection = new StringSelection(b);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, selection);
                element.sendKeys(Keys.CONTROL, "v");

                StringSelection stringSelection = new StringSelection("");
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
                        stringSelection, null);

            }*/

            // element.sendKeys(Keys.CONTROL, "v");

            //driver.findElement(By.xpath("//*[@id='HarnessFooter']/tbody/tr/td[2]/table/tbody/tr/td[2]/nobr/table/tbody/tr/td[1]")).click();
//*[@id="HarnessFooter"]/tbody/tr/td[2]/table/tbody/tr/td[2]/nobr/table/tbody/tr/td[2]/button

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


        }



        return crm_id;
    }

    public String getID() throws IOException, InterruptedException {
Sirius();
return crm_id;
    }
}
