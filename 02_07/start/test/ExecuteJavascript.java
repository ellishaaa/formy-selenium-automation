import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/ellisha/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://stage.customwheeloffset.com/cart?cart_id=4903228");

        WebElement button = driver.findElement(By.className("checkout-btn"));
        button.click();

        Thread.sleep(3000);

        WebElement affirmBegin = driver.findElement(By.id("affirm-dropin"));
        affirmBegin.click();

        Thread.sleep(2000);

        WebElement affirm = driver.findElement(By.id("affirm-button-display"));
        affirm.click();

        Thread.sleep(3000);

        WebElement autoFirst = driver.findElement(By.id("first_name"));
        autoFirst.sendKeys("Elli");

        WebElement autoLast = driver.findElement(By.id("last_name"));
        autoLast.sendKeys("Sha");

        WebElement autocomplete = driver.findElement(By.id("address_street"));//ui-id-237
        autocomplete.sendKeys("1442 S Chestnut Ave, Green");

        WebElement autoResult = driver.findElement(By.className("us-autocomplete-pro-menu"));
        autoResult.click();

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

        Thread.sleep(4000);

        //pro21xrFUA4
        WebElement affirmPhone = driver.findElement(By.className("pro21xrFUA4"));//ui-id-237
        affirmPhone.sendKeys("9209732014");

        WebElement affirmCont = driver.findElement(By.className("propvHOJQwT"));
        affirmCont.click();

        //pro3hEyhkVV
        Thread.sleep(4000);
        WebElement affirmPin = driver.findElement(By.className("pro3hEyhkVV"));//ui-id-237
        affirmPin.sendKeys("1234");

    }
}
