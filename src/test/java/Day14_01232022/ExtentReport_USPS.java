package Day14_01232022;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class ExtentReport_USPS {
    public static class ExtendReport_USPS_Example extends Reusable_Annotations {


        @Test()
        public void USPSTest(){
            logger = reports.startTest("Track a package on USPS");
            //navigate to usps
            logger.log(LogStatus.INFO,"Navigate to USPS home page");
            driver.navigate().to("https://www.usps.com");
            //hover to the quick tool tab
            Reusable_Actions_Loggers.mouseHover(driver,"//*[text()='Quick Tools']",logger,"Quck tools");
            //click on track a package
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Track a Package']",logger,"Track a Packgage");
            //enter your tracking number
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='tracking-input']","1111111111",logger,"Track Field");
            //click on track button
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@class='button tracking-btn']",logger,"Track Button");

            //end the logger
            reports.endTest(logger);
        }//end of test


    }//end of java class

}
