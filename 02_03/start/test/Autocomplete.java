import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/ellisha/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://stage.customwheeloffset.com/cart?cart_id=4903228");

        WebElement button = driver.findElement(By.className("checkout-btn"));
        button.click();

        WebElement payGift = driver.findElement(By.id("giftcard-dropin"));
        payGift.click();

        WebElement enterGift = driver.findElement(By.id("giftcard"));//ui-id-237
        enterGift.sendKeys("GBDJO3GRNRPW87FAJ");

        WebElement applyGift = driver.findElement(By.id("giftcard-apply"));
        applyGift.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement name = driver.findElement(By.id("first_name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        WebElement autoFirst = driver.findElement(By.id("first_name"));
        autoFirst.sendKeys("Elli");

        WebElement autoLast = driver.findElement(By.id("last_name"));
        autoLast.sendKeys("Sha");

        WebElement autocomplete = driver.findElement(By.id("address_street"));//ui-id-237
        autocomplete.sendKeys("1442 S Chestnut Ave, Green");

        WebElement autoCity = driver.findElement(By.id("address_city"));//ui-id-237
        autoCity.sendKeys("Green Bay");

        WebElement autoState = driver.findElement(By.id("address_state"));//ui-id-237
        autoState.sendKeys("WI");

        WebElement autoZip = driver.findElement(By.id("address_zip"));//ui-id-237
        autoZip.sendKeys("54304");

        WebElement autoEmail = driver.findElement(By.id("payer_email"));//ui-id-237
        autoEmail.sendKeys("ellisha@fitmentindustries.com");

        WebElement autoPhone = driver.findElement(By.id("phone"));//ui-id-237
        autoPhone.sendKeys("9209732014");

        Select drpAmbassador = new Select(driver.findElement(By.id("ambassadors")));
        drpAmbassador.selectByVisibleText("Google");


        WebElement termButton = driver.findElement(By.id("text_confirm"));
        termButton.click();

        WebElement submitAgain = driver.findElement(By.id("submit-order"));
        submitAgain.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

      //  WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box")));

        WebElement track = driver.findElement(By.id("box"));
        track.click();

        driver.quit();



    }
}
