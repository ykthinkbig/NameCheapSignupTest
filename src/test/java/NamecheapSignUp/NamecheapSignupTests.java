package NamecheapSignUp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NamecheapSignupTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //fetch URL to automate
        driver.get("https://www.namecheap.com/myaccount/signup/");
        Thread.sleep(5000);

        // maximize ta page of your browser while page loads
        driver.manage().window().maximize();

        // get page title
        System.out.println(driver.getTitle());

        // make page wait while url fully loads
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_SignupUName")).sendKeys("xxxxx");
        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_SignupPWord")).sendKeys("xxx");
        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_ConfirmPassword")).sendKeys("xxxx");
        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_FirstName")).sendKeys("xxxx");
        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_LastName")).sendKeys("xxxx");
        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_Email")).sendKeys("xxxx");
        driver.findElement(By.id("ctl00_ctl00_ctl00_ctl00_base_content_web_base_content_home_content_page_content_left_ctl02_CreateUserButton")).click();
        //quit broswer after test
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        NamecheapSignupTests test = new NamecheapSignupTests();
        test.setUp();
    }

}
