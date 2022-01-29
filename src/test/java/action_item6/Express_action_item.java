package action_item6;

import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_action_item {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions_Loggers.setDriver();
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html",true);
    }//end of precondition

    @Test()
    public void ExpressTest() throws BiffException, IOException, WriteException, InterruptedException {
        logger= reports.startTest("Shop on Express");
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/google search.xls"));
        Sheet readableSheet = readableFile.getSheet(1);
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/google search_Results.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(1);
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);


        for (int i = 1; i <rowCount2; i++) {
            String Size = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + Size);
            String Quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + Quantity);
            String Firstname = writableSheet.getCell(2, i).getContents();
            System.out.println("My values are " + Firstname);
            String Lastname = writableSheet.getCell(3, i).getContents();
            System.out.println("My values are " + Lastname);
            String Email = writableSheet.getCell(4, i).getContents();
            System.out.println("My values are " + Email);
            String PhoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My values are " + PhoneNumber);
            String Address = writableSheet.getCell(6, i).getContents();
            System.out.println("My values are " + Address);
            String ZipCode = writableSheet.getCell(7, i).getContents();
            System.out.println("My values are " + ZipCode);
            String City = writableSheet.getCell(8, i).getContents();
            System.out.println("My values are " + City);
            String State = writableSheet.getCell(9, i).getContents();
            System.out.println("My values are " + State);
            String CardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My values are " + CardNumber);
            String ExpMonth = writableSheet.getCell(11, i).getContents();
            System.out.println("My values are " + ExpMonth);
            String ExpYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My values are " + ExpYear);
            String CVVCode = writableSheet.getCell(13, i).getContents();
            System.out.println("My values are " + CVVCode);
            String ErrorMassage = writableSheet.getCell(14, i).getContents();
            System.out.println("My values are " + ErrorMassage);

            logger = reports.startTest("checkout on Express");
            logger.log(LogStatus.INFO,"Navigate to Express home page");
            driver.navigate().to("https://www.express.com");
            String actualTitle = driver.getTitle();
            if(actualTitle.equals("Express - Men's & Women's Clothing")){
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match Actual title is " + actualTitle);
            }
            Reusable_Actions_Loggers.mouseHover(driver,"//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]",logger,"Women");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[contains(@href,'womens-clothing/dresses/cat550007')]",logger,"dresser");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@class='close_button-20856-button close_button-20856-button-d2 bluecoreCloseButton']",logger,"close add");
            Thread.sleep(2500);
            Reusable_Actions_Loggers.scrollMethod(driver,"0","550","scroll");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Puff Sleeve Button Sweater Dress']",logger,"click on sweater ");
            Thread.sleep(2500);
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+Size+"']",logger,"Size");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Add to bag");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",logger,"Viw bag");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+Quantity+"']",logger,"quantity");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",logger,"checkout");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",logger,"checkout as Gust");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='firstname']",Firstname,logger,"firstname");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']",Lastname,logger,"lastname");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']",Email,logger,"Email");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']",Email,logger,"confirm email");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']",PhoneNumber,logger,"PhoneNumber");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"continue");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"continue");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']",Address,logger,"enter address");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",ZipCode,logger,"zipcode");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']",City,logger,"cities");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.state']",logger,"click state");
            Reusable_Actions_Loggers.selectMethode(driver,"//*[@name='shipping.state']",State,"select state");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"continue");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"continue");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='creditCardNumber']",CardNumber,logger,"enter cardNumber");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expMonth']",logger,"continue");
            Reusable_Actions_Loggers.selectMethode(driver,"//*[@name='expMonth']",ExpMonth,"expMonth");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expYear']",logger,"continue");
            Reusable_Actions_Loggers.selectMethode(driver,"//*[@name='expYear']",ExpYear,"expYear");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='cvv']",CVVCode,logger,"cvv code");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",logger,"placeOrder");

            String results = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@id='rvn-note-NaN']","ErrorMassage");
            System.out.println("error Massage "+results);
            Label label = new Label(14,i,results);
            writableSheet.addCell(label);
            driver.manage().deleteAllCookies();

        }//end of loop
        writableFile.write();
        writableFile.close();
        reports.endTest(logger);


    }//end of test
    @AfterSuite
    public void CloseDriver(){
        driver.quit();
        reports.flush();
    }

}//end of java class
