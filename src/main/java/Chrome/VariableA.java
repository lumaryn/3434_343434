package Chrome;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class VariableA {
    private String a;

     String getA() {


         try {
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test.txt"));
            // a = br.readLine();
             String b;

             while( ( b = br.readLine() ) != null ) {

                 StringSelection selection = new StringSelection(b);
                 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                 clipboard.setContents(selection, selection);
                // a=a+b;

             }


         } catch (IOException e) {
             System.out.println("Ошибка" + e);
         }

       /*  a = "<ns1:Envelope xmlns:ns1=http://sbrf.ru/Pegas/LegalLoanDeal/PutLegalLoanDealElements/ xmlns:tns=http://sbrf.ru/ESB/mq/headers xmlns:plldrq=\'http://sbrf.ru/Pegas/LegalLoanDeal/PutLegalLoanDealRq\' xmlns:ie=\'http://sbrf.ru/Pegas/LegalLoanDeal/IntegrationEntities\'> <tns:Header> <tns:message-id>A56B7F2637F911e8995C00144FF994CB</tns:message-id> <tns:request-time>2018-04-04T12:00:01Z</tns:request-time> <tns:eis-name>urn:sbrfsystems:99-crmcorp</tns:eis-name> <tns:system-id>urn:sbrfsystems:99-apkkb</tns:system-id> <tns:operation-name>PutLegalLoanDealRq</tns:operation-name> </tns:Header> <ns1:Body> <plldrq:PutLegalLoanDealRq>\t";

*/


return a;
}



}
