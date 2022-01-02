import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ellisha/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.customwheeloffset.com/store/wheels");


        WebElement keywordSearch = driver.findElement(By.id("key-search"));
        keywordSearch.click();
        keywordSearch.sendKeys("Meaghan Lewis");

        WebElement keywordSearch2 = driver.findElement(By.id("key-search"));
        keywordSearch2.click();
        keywordSearch2.sendKeys("Meaghan Lewis");

        WebElement button = driver.findElement(By.id("search-btn"));
        button.click();

        driver.quit();
    }
}

