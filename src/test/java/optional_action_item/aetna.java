package optional_action_item;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
import okio.Options;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class aetna {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        ArrayList<Integer> ZipCode = new ArrayList<>();

        ZipCode.add(11218);
        ZipCode.add(10019);
        ZipCode.add(07201);

        for (int i = 1; i < ZipCode.size(); i++) {
            try {
                driver.navigate().to("https://www.aetna.com");
            }catch (Exception e){
                System.out.println("unable to navigate to website " +e);
            }

            try {
                driver.findElement(By.xpath("//*[@class='megamenu__primary--item--btn']")).click();
            }catch (Exception e){
                System.out.println("unable to click on shop for plan " +e);
            }//end of shop for plan exception

            try {
                driver.findElement(By.xpath("//*[text()='Medicare']")).click();
            }catch (Exception e){
                System.out.println("unable to click in medicare");
            }//end of medicare Exception


            try {
                driver.findElements(By.xpath("//*[@class='megamenu__tertiary--link link__text--inline--tertiary']")).get(1).click();
            }catch (Exception e){
                System.out.println("unable to click on find doctor" +e);
            }//end of find doctor Exception

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[text()='2021 Medicare plans you purchase yourself']")).click();
            }catch (Exception e){
                System.out.println("unable to click 2021 Medicare plans you purchase yourself" +e);
            }//end of 2021 Medicare plans you purchase yourself Exception

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@id='medZip']")).sendKeys("11218");
            } catch (Exception e){
                System.out.println("unable to click zipcode field " +e);
            }

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='typeahead_grouping active']")).click();
            } catch (Exception e){
                System.out.println("unable to click in match making zipcode " +e);

            }

            Thread.sleep(2000);

            try {
                WebElement slider = driver.findElement(By.xpath("//*[@class='rz-pointer rz-pointer-min']"));
                Actions action = new Actions(driver);
                action.dragAndDropBy(slider,-100,0).build().perform();
            } catch (Exception e){
                System.out.println("unable to drag and drop slider " +e);
            }//end of drag and drop Exception


            try {
                driver.findElement(By.xpath("//*[@class='primaryPurple BtnWidth col-md-6 col-xs-12']")).click();
            } catch (Exception e){
                System.out.println("unable to click skip plan selection" +e);
            }

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='mobileMarAdj anchorTagGuided']")).click();
            } catch (Exception e){
                System.out.println("unable to click medical doctors exception" +e);
            }

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='mobileMarAdj anchorTagGuided']")).click();
            } catch (Exception e){
                System.out.println("unable to click on doctor primary care Exception" +e);
            }

            Thread.sleep(2000);

            try {
                driver.findElements(By.xpath("//*[@class='dummyLinkLabel']")).get(0).click();
            } catch (Exception e){
                System.out.println("unable to click all primary care Exception" +e);
            }

            Thread.sleep(3000);

            try {
                driver.findElements(By.xpath("//*[@class='providerNameDetails']")).get(1).click();
            } catch (Exception e){
                System.out.println("unable to click all provider Exception" +e);
            }







        }//end of the loop
    }//end of main
}//end of java class
