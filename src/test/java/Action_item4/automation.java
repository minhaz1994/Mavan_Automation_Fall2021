package Action_item4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class automation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> ZipCode = new ArrayList<>();

        ZipCode.add("11218");
        ZipCode.add("10019");
        ZipCode.add("07201");

        for (int i = 0; i < ZipCode.size(); i++) {
            try{
                driver.navigate().to("https://www.weightwatchers.com");
            }catch (Exception e){
                System.out.println("unable to navigate to website " + e);
            }

            try{
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            }catch (Exception e){
                System.out.println("unable to click on Attend dropdown " + e);
            }

            try{
                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__3LoiE']")).click();
            }catch (Exception e){
                System.out.println("unable to click on Unlimited Workshops " + e);
            }

            try{
                driver.findElement(By.xpath("//*[@class='studioIcon-2TdMR']")).click();
            }catch (Exception e){
                System.out.println("unable to click on studio " + e);
            }

            try{
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(ZipCode.get(i));
            }catch (Exception e){
                System.out.println("unable to input zipcode " + e);
            }

            Thread.sleep(200);

            try{
                driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();
            }catch (Exception e){
                System.out.println("unable to click on arrow " + e);
            }

            try {
               List<WebElement> links = driver.findElements(By.xpath("//*[@class='container-3SE46']"));
               //set condition
                if (i == 0){
                    links.get(1).click();
                } else if (i == 1){
                    links.get(2).click();
                } else if (i == 0){
                    links.get(0).click();
                }//end of condition
            }catch (Exception e){
                System.out.println("unable to click on link " + e);
            }

            try{
                String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("the studio address for zipcode " +ZipCode.get(i)+ " is " +address);
            }catch (Exception e){
                System.out.println("unable to print address" + e);
            }

            try{
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,950)");

            }catch (Exception e){
                System.out.println("unable to scroll" + e);
            }

            try{
                String schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
                System.out.println("the studio address for zipcode " +ZipCode.get(i)+ " is " +schedule);
            }catch (Exception e){
                System.out.println("unable to print schedule" + e);
            }//end of address exception


        }//end of loop
    }//end of main

}//end of java class
