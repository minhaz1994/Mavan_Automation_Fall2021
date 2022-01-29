package Day9_01082022;

import org.openqa.selenium.WebDriver;

public class UPS_reusable_methode {
    public static void main(String[] args) {
        WebDriver driver = Reusable_Actions.setDriver();
        //navigate to UPS
        driver.navigate().to("http://www.UPS.com/us");

        //click on track
        Reusable_Actions.clickMethod(driver,"//*[text()='Tracking']","Track");

        //click on Track a package
        Reusable_Actions.clickMethod(driver,"//*[text()='Track a Package']","Track a package");

        Reusable_Actions.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","11111111111111","Enter Tracking");

        Reusable_Actions.clickMethod(driver,"//*[@id='stApp_btnTrack']","clicking on the track");

        //capture the error message and print out only 'We could not locate the shipment'
        String resultValue = Reusable_Actions.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error Message");
        //declare array and split
        String[] arrayResult = resultValue.split("details");
        System.out.println("My error info is " + arrayResult[0]);

    }//end of test
}//end of java class
