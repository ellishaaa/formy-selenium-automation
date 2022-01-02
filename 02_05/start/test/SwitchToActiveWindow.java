import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/ellisha/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://stage.customwheeloffset.com/");


        WebElement footer = driver.findElement(By.id("co-footer"));
        Actions actions = new Actions(driver);
        actions.moveToElement(footer);

        driver.findElement(By.linkText("Fitment Industries")).click();


        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        Thread.sleep(3000);
        driver.switchTo().window(originalHandle);

        Thread.sleep(3000);
        driver.quit();
    }
}
