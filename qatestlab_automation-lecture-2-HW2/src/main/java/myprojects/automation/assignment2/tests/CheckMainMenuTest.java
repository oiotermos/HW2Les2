
        package myprojects.automation.assignment2.tests;

        import myprojects.automation.assignment2.BaseScript;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Random;

        import static java.lang.Thread.sleep;

public class CheckMainMenuTest extends BaseScript{

    private static String BASE_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to check Main Menu items

        WebDriver driver = getDriver();

        driver.get(BASE_URL);

        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("webinar.test@gmail.com");

        element = driver.findElement(By.name("passwd"));
        element.sendKeys("Xcg7299bnSmMuRLp9ITw");
        element.submit();

        System.out.println("Page title is: " + driver.getTitle());

        sleep(1000);

        List<WebElement> elements = driver.findElements(By.className("maintab"));

        for(int i = 1; elements.size() > i; i++) {
            driver.findElements(By.className("maintab")).get(i).click();
            driver.navigate().refresh();
            sleep(1000);
            String s = driver.findElement(By.cssSelector("div > h2")).getText();
            System.out.println(s);
            driver.navigate().back();
        }

        driver.quit();

    }
}