package Day14_01232022;

import Reusable_Library.Reusable_Annotations;
import USPS_Page_Object.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class USPS_Ship_A_Label_POM extends Reusable_Annotations {
    @Test
    public void USPS_Verify_Tabs_Then_Ship_A_Label(){
        //test
            //navigate to usps
            logger.log(LogStatus.INFO,"Navigating to USPS home page");
            driver.navigate().to("https://www.usps.com");

            //verify the tabs count
            BaseClass.Homepage().getNavigationTabsCount();

            //click on Send tab
            BaseClass.Homepage().clickOndSendTab();

            //click on Ship a Label
            BaseClass.sendMailAndPackages().clickOnPrintLabelButton();

    }

}
