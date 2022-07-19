import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends BaseDriver{

    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement fullNameBox = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        fullNameBox.click();
        fullNameBox.sendKeys("Automation");

        WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
        emailBox.click();
        emailBox.sendKeys("testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("div[id='currentAddress-wrapper'] textarea[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper']>:nth-child(2)>textarea[class='form-control']"));
        permanentAddress.click();
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='button'][class='btn btn-primary']"));
        submitButton.click();

        WebElement nameResult = driver.findElement(By.cssSelector("div[id='output']>div>:nth-child(1)"));
        System.out.println(nameResult.getText().contains("Automation"));

        WebElement emailResult = driver.findElement(By.cssSelector("div[id='output']>div>:nth-child(2)"));
        System.out.println(emailResult.getText().contains("testing"));

        WebElement currentAddressResult = driver.findElement(By.cssSelector("div[id='output']>div>:nth-child(3)"));
        System.out.println(currentAddressResult.getText().contains("Testing Current"));

        WebElement permanentAddressResult = driver.findElement(By.cssSelector("div[id='output']>div>:nth-child(4)"));
        System.out.println(permanentAddressResult.getText().contains("Testing Permanent"));

        waitAndQuit();

    }

}
