package io.pragra.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class HotelsDemoTest {

    WebDriver driver;
    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");
        // FireFox, Chrome, Opera
        driver = new ChromeDriver(); // Open a broswer instance
        driver.get("https://ca.hotels.com/");
    }

    @Test
    public void simulateBooking() throws InterruptedException {
        WebElement destinationInput = driver.findElement(By.name("q-destination"));
        destinationInput.sendKeys("Niagra");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@class, 'widget-autosuggest-visible')]//tbody/tr[1]")).click();

        driver.findElement(By.name("q-localised-check-in")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='widget-datepicker']//td[@data-date='2021-2-28']")).click();
        driver.findElement(By.name("q-localised-check-out")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@class='widget-datepicker']//td[@data-date='2021-3-7']")).click();

        WebElement datePickerMonth = driver.findElement(By.xpath("//div[@class='widget-datepicker']//div[@class='widget-datepicker-label']"));

        String destMonth = "July 2021";

            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='widget-datepicker']//button[@class='widget-datepicker-next']"));
            for (WebElement element: elements) {
                if(element.isDisplayed()) {
                    element.click();
                    Thread.sleep(1000);
                    datePickerMonth = driver.findElement(By.xpath("//div[@class='widget-datepicker']//div[@class='widget-datepicker-label']"));
                }
                if(datePickerMonth.getText().equals(destMonth)) {
                    break;
                }
            }


        driver.findElement(By.xpath("//div[@class='widget-datepicker']//td[@data-date='2021-6-7']")).click();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
