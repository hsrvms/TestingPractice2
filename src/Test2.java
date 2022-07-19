import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver{

    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        WebElement userNameBox = driver.findElement(By.cssSelector("input[placeholder='Enter your username']"));
        userNameBox.click();
        userNameBox.sendKeys("ttechno@gmail.com");

        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.click();
        passwordBox.sendKeys("techno123.");

        WebElement signInButton = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        signInButton.click();

        WebElement text = driver.findElement(By.cssSelector("div[class='element-actions']+h6"));
        System.out.println(text.getText().contains("Your nearest branch closes in: 30m 5s"));


        waitAndQuit();


    }

}
