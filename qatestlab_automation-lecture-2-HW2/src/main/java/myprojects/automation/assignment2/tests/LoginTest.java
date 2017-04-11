package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static java.lang.Thread.sleep;

public class LoginTest extends BaseScript {

    private static String BASE_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();

        driver.get(BASE_URL);

        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("webinar.test@gmail.com");

        element = driver.findElement(By.name("passwd"));
        element.sendKeys("Xcg7299bnSmMuRLp9ITw");
        element.submit();

        System.out.println("Page title is: " + driver.getTitle());

        sleep(1000);

        element = driver.findElement(By.id("employee_infos"));
        element.click();

        element = driver.findElement(By.id("header_logout"));
        element.click();

        driver.quit();

    }
}