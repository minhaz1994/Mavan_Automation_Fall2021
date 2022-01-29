package Action_item3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bing_automation {
    public static void main(String[] args) throws InterruptedException {
        String[] Sports = new String[6];
        Sports[0] = "football";
        Sports[1] = "cricket";
        Sports[2] = "soccer";
        Sports[3] = "NFL";
        Sports[4] = "Hockey";
        Sports[5] = "tennis";

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        for(int i =0; i < Sports.length; i++){

            driver.navigate().to("https://www.bing.com");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Sports[i]);
            driver.findElement(By.xpath("//*[@aria-label='Search the web']")).submit();
            Thread.sleep(1000);
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();
            String[] arrayResult = result.split( " ");
            System.out.println("my search number for sport " +Sports[i] + " is " +arrayResult[0]);

        }//end of the loop

    }//end of main

}//end of java class
