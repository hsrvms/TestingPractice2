import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test4 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateLink = driver.findElement(By.cssSelector("a[href='/calculate.php']"));
        calculateLink.click();

        WebElement firstValue = driver.findElement(By.cssSelector("form[action='calculate.php']>:nth-child(1)"));
        firstValue.click();
        firstValue.sendKeys("7");

        WebElement secondValue = driver.findElement(By.cssSelector("form[action='calculate.php']>:nth-child(3)"));
        secondValue.click();
        secondValue.sendKeys("13");

        WebElement calculateButton = driver.findElement(By.cssSelector("form[action='calculate.php']>:nth-child(4)"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.cssSelector("form[action='calculate.php']+span"));
        System.out.println(answer.getText());

        waitAndQuit();

    }

}
