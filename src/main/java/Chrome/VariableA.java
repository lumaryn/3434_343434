package Chrome;

import sun.security.util.Length;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VariableA {
    private String a;

     public void getA() throws Exception{


         try {


                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\OPF_VALUE.txt"));
                 // a = br.readLine();
             List<String> IDofOPF = new ArrayList<String>();
            // LinkedHashSet<String>IFR = new LinkedHashSet<>();

              String b = "";

              // int r = 357;
             // for (int i=0; i<r; i++)
            while ((br.readLine() != null))
               {

                   b = br.readLine();
                   IDofOPF.add(b);
                   br.readLine();
               }
               br.close();

               System.out.println(IDofOPF);

             List<String> IDofOPF1 = new ArrayList<>(new LinkedHashSet<>(IDofOPF));
             FileWriter wr = new FileWriter("C:\\Users\\user\\Desktop\\OPF_work_Value.txt");




             for(String line : IDofOPF1){
                 System.out.println(line);
                 wr.write(line);
                 wr.write(System.getProperty("line.separator"));
             }
             wr.flush();

             Logger.getLogger(VariableA.class.getName()).log(Level.SEVERE, (String) null);




                     /*while ((b = br.readLine()) != null)
                     StringSelection selection = new StringSelection(b);
                     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                     clipboard.setContents(selection, selection);
                     // a=a+b;*/


             } catch (FileNotFoundException ex) {
             ex.printStackTrace();
         } catch (IOException ex) {
             ex.printStackTrace();
         }

         /*  a = "<ns1:Envelope xmlns:ns1=http://sbrf.ru/Pegas/LegalLoanDeal/PutLegalLoanDealElements/ xmlns:tns=http://sbrf.ru/ESB/mq/headers xmlns:plldrq=\'http://sbrf.ru/Pegas/LegalLoanDeal/PutLegalLoanDealRq\' xmlns:ie=\'http://sbrf.ru/Pegas/LegalLoanDeal/IntegrationEntities\'> <tns:Header> <tns:message-id>A56B7F2637F911e8995C00144FF994CB</tns:message-id> <tns:request-time>2018-04-04T12:00:01Z</tns:request-time> <tns:eis-name>urn:sbrfsystems:99-crmcorp</tns:eis-name> <tns:system-id>urn:sbrfsystems:99-apkkb</tns:system-id> <tns:operation-name>PutLegalLoanDealRq</tns:operation-name> </tns:Header> <ns1:Body> <plldrq:PutLegalLoanDealRq>\t";

*/



}



}
