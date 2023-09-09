import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.TestRunner.PriorityWeight.priority;

public class Registration {




    WebDriver driver;

    @Test
    void nopregisteration(){

        // set up a path for webdriver
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver-win32\\chromedriver.exe");
        // Create an instance for a webDriver
        driver = new ChromeDriver();
        // Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        // Maximise the screen
        driver.manage().window().maximize();
        // get title
        driver.getTitle();


        }


      void register(){
          driver.findElement(By.className("ico-register")).click();
          driver.findElement(By.className("male")).click();
          driver.findElement(By.id("FirstName")).sendKeys("Nishant");
          driver.findElement(By.id("LastName")).sendKeys("Dhanani");
          driver.close();





    }



    }





