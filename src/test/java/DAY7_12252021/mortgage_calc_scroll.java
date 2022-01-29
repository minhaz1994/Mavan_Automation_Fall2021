package DAY7_12252021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mortgage_calc_scroll {
    public static void main(String[] args) throws InterruptedException {
        //webdriver manager to open by wabdriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //start maximize
        options.addArguments("start-maximized");
        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(2500);

        //scroll to the windows of loan view
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to the viw by pixels
        jse.executeScript("scroll(0,400)");




    }//main method


}//end of java class
