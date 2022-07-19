import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseDriver {

    public static void main(String[] args){

        driver.get("https://www.snapdeal.com/");


        WebElement searchBox = driver.findElement(By.cssSelector("input[class='col-xs-20 searchformInput keyword']"));
        searchBox.click();
        searchBox.sendKeys("teddy bear");

        WebElement searchButton = driver.findElement(By.cssSelector("button[onclick^='submitSearchForm']"));
        searchButton.click();

        WebElement searchResult = driver.findElement(By.cssSelector("div[id='searchMessageContainer'] span[class='nnn']"));
        System.out.println(searchResult.getText().contains("results for 'teddy bear'"));

        waitAndQuit();

    }

}
